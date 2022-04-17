package 策略模式;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("这只鸭子正在飞。");
    }
}
