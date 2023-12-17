package game.comparators;

import java.util.Comparator;

import game.components.Monster;

public class CompVida implements Comparator<Monster> {

    @Override
    public int compare(Monster o1, Monster o2) {
        return o2.getLife() - o1.getLife();
    }
    
}
