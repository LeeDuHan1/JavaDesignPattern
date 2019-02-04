package StrategyPattern.PatternOn;

import StrategyPattern.PatternOn.Attack.MissileStrategy;
import StrategyPattern.PatternOn.Attack.PunchStrategy;
import StrategyPattern.PatternOn.Robot.Atom;
import StrategyPattern.PatternOn.Robot.Robot;
import StrategyPattern.PatternOn.Robot.TaekwonV;
import StrategyPattern.PatternOn.move.FlyingStrategy;
import StrategyPattern.PatternOn.move.WalkingStrategy;
import StrategyPattern.PatternTest;

/**
 *  스트래티지 패턴은 같은 문제를 해결하는 여러 알고리즘이 클래스별로 캡슐화되어 있고
 *  이들이 필요할 때 교체할 수 있도록 함으로써 동일한 문제를 다른 알고리즘으로 해결할 수 있게 하는
 *  디자인 패턴이다.
 */
public class StrategyPatternOn extends PatternTest {

    @Override
    public void TestStart() {
        super.TestStart();
        Robot taekwonV = new TaekwonV("TaekwonV_1");
        Robot atom = new Atom("Atom_1");

        taekwonV.setAttackStrategy(new MissileStrategy());
        taekwonV.setMovingStrategy(new WalkingStrategy());

        atom.setAttackStrategy(new PunchStrategy());
        atom.setMovingStrategy(new FlyingStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("//////////////////////////////////////////////////////////////");

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();


    }
}
