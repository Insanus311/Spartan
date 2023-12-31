package entregable.ataques;

import game.attacks.Attack;
import game.attacks.Beast;
import game.attacks.Fire;
import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Estado;
import game.types.Type;

public class ZarpazoIgneo implements Fire, Beast, Attack {

    @Override
    public int damage(Monster monster) {
        int damage = RandomGenerator.getInstance().calculateDamage(90, 150);
        if (monster.getTypes().contains(Type.COLD))
            damage *= 1.5;
        monster.setEstado(Estado.QUEMANDOSE);
        System.out.println("--     ["+ monster +"] Se esta quemando!!!");
        return damage;
    }
    
}
