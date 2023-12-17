package entregable.ataques;

import game.attacks.Attack;
import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class Kunai implements ArteMarcial, Attack {

    @Override
    public int damage(Monster monstruo){
        int damage = RandomGenerator.getInstance().calculateDamage(150, 400);
        if (monstruo.getTypes().contains(Type.PIEDRA)){
            return damage/2;
        } else return damage;
    }

}
