package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.print();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("-".repeat(60));
        Duck modelDuck = new ModelDuck();
        modelDuck.print();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
