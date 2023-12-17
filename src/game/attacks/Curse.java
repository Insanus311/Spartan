package game.attacks;

import game.components.Monster;

public class Curse implements Demon, Attack {

    @Override
    public int damage(Monster monster) {
        return 500;
    }
}
