import game.comparators.CompDefensa;
import game.comparators.CompVida;
import game.components.Monster;
import game.components.RumbleGame;
import game.monsters.EvilBeast;
import game.monsters.IceBeast;


import game.monsters.Spartan;

import java.util.Arrays;
import java.util.List;

import entregable.monstruos.FireBeast;
import entregable.monstruos.GolemEmpedrado;
import entregable.monstruos.Ninja;

public class Main {
    public static void main(String[] args) {
        RumbleGame rumbleGame = RumbleGame.getInstance();
        rumbleGame.init();

        List<Monster> monstersOne = Arrays.asList(
                new Spartan("Spartan 1"),
                new Spartan("Spartan 2"),
                new Spartan("Spartan 3"),
                new Ninja ("Kai"),
                new Spartan("Spartan 4"),
                new Spartan("Spartan 5")
                /*new Spartan("Spartan 6"),
                new Spartan("Spartan 7"),
                new Spartan("Spartan 8"),
                new Spartan("Spartan 9"),
                new Spartan("Spartan 10"),
                new IceBeast("Ice Beast"),
                new Spartan("Spartan 24"),
                new Spartan("Spartan 224"),
                new Spartan("Spartan 34"),
                new Spartan("Spartan 44"),
                new Spartan("Spartan 64"),
                new Spartan("Spartan 15")*/
                );

        //TODO ordenar el listado de monstruos que recibe el jugador uno
        monstersOne.sort(new CompVida());

        rumbleGame.getPlayerOne().setMonsters(monstersOne);
        

        List<Monster> monstersTwo = Arrays.asList(
                new Spartan("Spartan A"),
                new GolemEmpedrado("Manolito"),
                new Spartan("Spartan B"),
                new FireBeast("Alejandrito")
                );

        //TODO ordenar el listado de monstruos que recibe el jugador dos
        monstersTwo.sort(new CompDefensa());

        rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

        rumbleGame.startGame();
    }
}