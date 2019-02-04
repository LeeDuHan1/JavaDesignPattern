package StrategyPattern.PatternOn.Robot;

import StrategyPattern.PatternOn.Attack.AttackStrategy;
import StrategyPattern.PatternOn.move.MovingStrategy;

public abstract class Robot {
    String mName;
    MovingStrategy mMovingStrategy;
    AttackStrategy mAttackStrategy;

    public Robot(String name){
        this.mName = name;
    }

    public String getName(){
        return this.mName;
    }

    public void move(){
        mMovingStrategy.move();
    }

    public void attack(){
        mAttackStrategy.attack();
    }

    public void setMovingStrategy(MovingStrategy movingStrategy){
        this.mMovingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.mAttackStrategy = attackStrategy;
    }

}
