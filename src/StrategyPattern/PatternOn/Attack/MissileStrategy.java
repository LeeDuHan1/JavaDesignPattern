package StrategyPattern.PatternOn.Attack;

public class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Missile and can attack with it");
    }
}
