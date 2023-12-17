package entregable.monstruos;

import java.util.*;

import entregable.ataques.Cabezazo;
import entregable.ataques.ZarpazoIgneo;
import game.attacks.Attack;
import game.components.Monster;
import game.types.Estado;
import game.types.Type;

public class FireBeast extends Monster {
    List<Attack> attacks = Arrays.asList(new ZarpazoIgneo(),new Cabezazo());

    public FireBeast(String name) {
        this.life = 300;
        this.monsterName = name;
        this.activeSkill = attacks.get(0);
        this.types = Arrays.asList(Type.FIRE, Type.BEAST);
    }

    @Override
    public void attack(Monster monstruo){
        super.attack(monstruo);
        if (activeSkill instanceof ZarpazoIgneo){
            activeSkill = attacks.get(1);
        } else {
            activeSkill = attacks.get(0);
            estado = Estado.ATURDIDO;
        }
    }
}
