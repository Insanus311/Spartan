package entregable.monstruos;

import java.util.Arrays;

import entregable.ataques.Kunai;
import entregable.ataques.Shuriken;
import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class Ninja extends Monster {
    private Shuriken shuriken = new Shuriken();
    private Kunai kunai = new Kunai();

    public Ninja(String name) {
        this.life = 150;
        this.monsterName = name;
        this.activeSkill = shuriken;
        this.types = Arrays.asList(Type.ARTE_MARCIAL, Type.SIGILO);
    }

    @Override
    public void attack(Monster monster){
        if (shuriken.getCantSHuriken() == 0){
            activeSkill = kunai;
        }
        super.attack(monster);
    }

    @Override
    public void onDamageReceive(Integer damage, Monster monster){
        if (RandomGenerator.getInstance().calcularPorcentual() > 40){
            super.onDamageReceive(damage, monster);
        }
    }
}
