package game.attacks;

import entregable.ataques.Skill;
import game.components.Monster;

public interface Attack extends Skill {

    int damage(Monster monster);

}
