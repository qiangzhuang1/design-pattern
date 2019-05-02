package demo1;

public abstract class Duck {
    //叫的行为
    QuackBehavior quackBehavior;
    //飞行行为
    FlyBehavior flyBehavior;
    public Duck(){}

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
    // 加入两个新的方法，以后可以随时调用者两个方法改变鸭子的行为
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
