package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;

public class Apedrear implements Piedra {
    
    @Override
    public int damage (Monster monstruo){
        return RandomGenerator.getInstance().calculateDamage(500,1500);
    }

}
