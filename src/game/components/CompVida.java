package game.components;

import java.util.Comparator;

public class CompVida implements Comparator<Monster> {

    @Override
    public int compare(Monster o1, Monster o2) {
        return o1.getLife() - o2.getLife();
    }
    
}
