package StrategyPattern.PatternOff;

import StrategyPattern.PatternTest;

/**
 *  기존 로봇의 공격 또는 이동 방법을 수정하려면 어떤 변경 작업을 해야 하는가?
 *  예를 들어 아톰이 날 수는 없고 오직 걷게만 만들고 싶다면?
 *  또는 태권V를 날게 하려면?
 *  즉 메소드 수정이 필요한 경우
 *
 *  새로운 로봇을 만들어 기존의 공격 또는 이동 방법을 추가하거나 수정하려면?
 *  예를 들어 새로운 로봇으로 지구의 용사 선가드를 만들어 태권V의 미사일 공격 기능을 추가하려면?
 *  -> attack 메소드를 하나 더 만들어야 하는데 이러한 경우 나중에 큰 문제를 일으킬 수 있다.
 *  즉 메소드 추가가 필요한 경우
 */
public class StrategyPatternOff extends PatternTest {
    @Override
    public void TestStart() {
        super.TestStart();
        Robot taegwonV = new TaekwonV("TaekwonV_1");
        Robot atom = new Atom("Atom_1");

        System.out.println("My name is " + taegwonV.getName());
        taegwonV.attack();
        taegwonV.move();

        System.out.println("My name is " + atom.getName());
        atom.attack();
        atom.move();
    }
}
