package game.components;

import game.attacks.Attack;
import game.types.*;

import java.util.List;


public abstract class Monster {

    protected Integer life;
    protected Attack activeSkill;
    private Player player;
    protected String monsterName;
    protected List<Type> types;
    protected Estado estado = Estado.DEFAULT;

    public void attack(Monster monster){
        int damage = this.activeSkill.damage(monster);
        if (estado.equals(Estado.ATURDIDO)){
            damage /= 2;
            estado = Estado.DEFAULT;
        }
        System.out.println("--     ["+ this +"] ataca a [" + monster + "] haciendole " + damage + " de daño");
        monster.onDamageReceive(damage, this);
    }

    public void onDamageReceive(Integer damage, Monster monster) {
        if (estado.equals(Estado.DEFENSA)){
            damage = damage / 2;
            estado = Estado.DEFAULT;
        }
        this.life = this.life - damage;
        if(this.life < 0) {
            this.life = 0;
        }
        System.out.println(this + " fue herido, queda con " + this.life + " puntos de vida");
    }

    public void move(PathBox oldPathBox, PathBox newPathBox) {
        if (estado.equals(Estado.QUEMANDOSE) && !types.contains(Type.FIRE)){
            life -= 50;
            if(this.life < 0) {
                this.life = 0;
            }
        }
        oldPathBox.setMonster(null);
        newPathBox.setMonster(this);
    }

    public Integer getLife() {
        return life;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado(){
        return estado;
    }

    @Override
    public String toString() {
        return monsterName;
    }

}
