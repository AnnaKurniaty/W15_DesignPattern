package Components;

public class DvdPlayer {
	public void on() {
    	System.out.println("[DVD Player] Turned ON");
    }
    public void off() {
    	System.out.println("[DVD Player] Turned OFF");
    }
    public void play(String movie) {
    	System.out.println("[DVD Player] Playing " + movie + "...");
    }
}
