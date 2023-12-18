package entregable.ataques;

import game.components.Monster;
import game.types.Estado;

public class DefensaPetrea implements Defensa, Piedra, Mejora {

    @Override
    public void activar(Monster monster) {
        System.out.println("Defensa Petrea!!!");
        monster.setEstado(Estado.DEFENSA);
    }
    
}
