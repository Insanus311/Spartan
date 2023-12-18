package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.Apedrear;
import entregable.ataques.DefensaPetrea;
import entregable.ataques.Skill;
import game.components.Monster;
import game.components.PathBox;
import game.random.RandomGenerator;
import game.types.Type;

public class GolemEmpedrado extends Monster {

    List<Skill> skills = Arrays.asList(new Apedrear(), new DefensaPetrea());

    public GolemEmpedrado(String name) {
        this.life = 1000;
        this.monsterName = name;
        this.activeSkill = skills.get(0);
        this.types = Arrays.asList(Type.GOLEM, Type.DEFENSA, Type.PIEDRA);
    }

    @Override
    public void act(Monster monster){
        if (RandomGenerator.getInstance().calcularPorcentual()>30){
            super.act(monster);
        }
        else System.out.println("--     ["+ this +"] no ataca en este turno");
        if (RandomGenerator.getInstance().calcularPorcentual()>50){
            activeSkill = skills.stream().filter(skill -> skill != activeSkill).findFirst().get();
        }
    }

    @Override
    public void move(PathBox oldPathBox, PathBox newPathBox){
        if (RandomGenerator.getInstance().calcularPorcentual() > 50){
            super.move(oldPathBox, newPathBox);
        }
        else System.out.println("--     ["+ this +"] no se mueve en este turno");
    }

}
