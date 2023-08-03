
public class SpinalCord {
    private boolean reflexEnabled;

    public SpinalCord() {
        reflexEnabled = true;
    }

    public void transmitSensorySignal(String signal) {
        System.out.println("Transmitting sensory signal to the brain: " + signal);
    }

    public void transmitMotorSignal(String signal) {
        System.out.println("Transmitting motor signal to the muscles: " + signal);
    }

    public void enableReflexes() {
        reflexEnabled = true;
        System.out.println("Reflexes enabled.");
    }

    public void disableReflexes() {
        reflexEnabled = false;
        System.out.println("Reflexes disabled.");
    }

    public boolean areReflexesEnabled() {
        return reflexEnabled;
    }

}

