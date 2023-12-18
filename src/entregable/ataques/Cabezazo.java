package entregable.ataques;

import game.attacks.Attack;
import game.attacks.Beast;
import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Estado;

public class Cabezazo implements Beast, Attack {

    @Override
    public int damage(Monster monster) {
        int damage = RandomGenerator.getInstance().calculateDamage(50, 160);
        monster.setEstado(Estado.ATURDIDO);
        System.out.println("--     ["+ monster +"] fue aturdido!!");
        return damage;
    }
    
}
