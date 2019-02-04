package StrategyPattern.PatternOff;

public class TaekwonV extends Robot {
    public TaekwonV(String name){
        super(name);
    }

    public void attack(){
        System.out.println("I have Missile and can attack with it!");
    }

    public void move(){
        System.out.println("I can only walk"); // 수정하려면 메소드를 수정해야 한다 -> OCP 위배
    }
}
