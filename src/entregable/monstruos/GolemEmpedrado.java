package entregable.monstruos;

import java.util.Arrays;

import entregable.ataques.Apedrear;
import game.components.Monster;
import game.components.PathBox;
import game.random.RandomGenerator;
import game.types.Estado;
import game.types.Type;

public class GolemEmpedrado extends Monster {

    public GolemEmpedrado(String name) {
        this.life = 1000;
        this.monsterName = name;
        this.activeSkill = new Apedrear();
        this.types = Arrays.asList(Type.GOLEM, Type.DEFENSA, Type.PIEDRA);
    }

    @Override
    public void attack(Monster monster){
        int porcentaje = RandomGenerator.getInstance().calcularPorcentual() % 3;
        switch (porcentaje) {
            case 0:
                super.attack(monster);
                break;
            case 1:
                this.estado = Estado.DEFENSA;
                break;
            case 2:
                break;
        }
    }

    @Override
    public void move(PathBox oldPathBox, PathBox newPathBox){
        if (RandomGenerator.getInstance().calcularPorcentual() > 50){
            super.move(oldPathBox, newPathBox);
        }
    }

}
