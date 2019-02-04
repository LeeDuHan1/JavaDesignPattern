import StrategyPattern.PatternOff.StrategyPatternOff;
import StrategyPattern.PatternOn.StrategyPatternOn;

public class Main {
    public static void main(String[] args){
        // 스트래티지 패턴 off
//        StrategyPatternOff strategyPatternOff = new StrategyPatternOff();
//        strategyPatternOff.TestStart();

        // 스트래티지 패턴 on
        StrategyPatternOn strategyPatternOn = new StrategyPatternOn();
        strategyPatternOn.TestStart();

    }
}
