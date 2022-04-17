package 策略模式;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("我正在以火箭的速度飞行。");
    }
}
