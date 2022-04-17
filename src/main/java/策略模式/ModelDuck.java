package 策略模式;

public class ModelDuck extends Duck{

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭。");
    }
}
