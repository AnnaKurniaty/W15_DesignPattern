package Quack;
public class MuteQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Cant't Quack");
    }
}
