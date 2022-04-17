package 策略模式;

public class Squack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("这只鸭子吱吱叫。");
    }
}
