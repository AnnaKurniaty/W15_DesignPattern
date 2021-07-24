
public class ConditionsMonitor implements IObserver {
    @Override
    public void update(double pressure, double temperature, double humidity) {
        System.out.println("The Pressure is " + pressure);
        System.out.println("The Temperature is " + temperature);
        System.out.println("The Humidity is " + humidity + "\n\n");
    }
}