package Fly;

public class FlyNoWay implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
}
