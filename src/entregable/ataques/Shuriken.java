package entregable.ataques;

import game.attacks.Attack;
import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class Shuriken implements ArteMarcial, Attack {

    int cantSHuriken = 20;
    
    @Override
    public int damage(Monster monstruo){
        int cant = RandomGenerator.getInstance().calculateShuriken(cantSHuriken);
        cantSHuriken-=cant;
        System.out.println("--     ["+ monstruo +"] Recibira " + cant + " impactos de Shuriken!!!");
        int damage = RandomGenerator.getInstance().calculateDamage(25, 75)*cant;
        if (monstruo.getTypes().contains(Type.PIEDRA)){
            return damage/2;
        }
        else return damage;
    }

    public int getCantSHuriken() {
        return cantSHuriken;
    }
}