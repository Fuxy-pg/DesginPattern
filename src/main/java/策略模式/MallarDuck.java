package 策略模式;

/**
 * 具体鸭子的实现
 */
public class MallarDuck extends Duck{

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一直模型鸭。");
    }
}
