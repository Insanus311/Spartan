package game.comparators;

import java.util.Comparator;

import game.components.Monster;
import game.types.Type;

public class CompDefensa implements Comparator<Monster> {

    @Override
    public int compare(Monster monstruo1, Monster monstruo2) {
        if (monstruo1.getTypes().contains(Type.DEFENSA) && !monstruo2.getTypes().contains(Type.DEFENSA)){
            return -1;
        } else if (!monstruo1.getTypes().contains(Type.DEFENSA) && monstruo2.getTypes().contains(Type.DEFENSA)){
            return 1;
        }
        else return 0;
    }
    
}
