package entregable.ataques;

import game.attacks.Attack;
import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Estado;

public class Apedrear implements Piedra, Attack {
    
    @Override
    public int damage (Monster monstruo){
        monstruo.setEstado(Estado.ATURDIDO);
        System.out.println("--     ["+ monstruo +"] fue aturdido!!");
        return RandomGenerator.getInstance().calculateDamage(500,1500);
    }

}
