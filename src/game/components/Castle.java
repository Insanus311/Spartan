package game.components;

import javax.swing.*;

import game.exceptions.NoMonstersException;

import java.util.Iterator;

public class Castle {

    private Integer castleLife = 3;
    private Path westPath;
    private Path eastPath;
    private JLabel lifeLabel;

    public Integer getCastleLife() {
        return castleLife;
    }

    public void nextRound(Long playerId, Iterator<Monster> monsterIterator) throws NoMonstersException {
        if(!westPath.haveMonster(playerId)) {
            if(monsterIterator.hasNext()) {
                westPath.releaseMonster(playerId, monsterIterator.next());
            }
        } else {
            westPath.nextRound(playerId, this);
        }

        if(!eastPath.haveMonster(playerId)) {
            if(monsterIterator.hasNext()) {
                eastPath.releaseMonster(playerId, monsterIterator.next());
            }
        } else {
            eastPath.nextRound(playerId, this);
        }

        if (!eastPath.haveMonster(playerId) && !westPath.haveMonster(playerId) && !monsterIterator.hasNext()){
            throw new NoMonstersException();
        }

        westPath.update();
        eastPath.update();
        lifeLabel.setText("Vidas: " + this.castleLife);
    }

    public void setCastleLife(Integer castleLife) {
        this.castleLife = castleLife;
    }

    public Path getWestPath() {
        return westPath;
    }

    public void setWestPath(Path westPath) {
        this.westPath = westPath;
    }

    public Path getEastPath() {
        return eastPath;
    }

    public void setEastPath(Path eastPath) {
        this.eastPath = eastPath;
    }

    public int getLife() {
        return this.castleLife;
    }

    public void setLife(int life) {
        this.castleLife = life;
    }

    public void setLifeLabel(JLabel lifeLabel) {
        this.lifeLabel = lifeLabel;
    }
}
