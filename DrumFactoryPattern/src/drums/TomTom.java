package drums;

public class TomTom extends Drum {
    public TomTom(String color, int diameter, double depth, String shell) {
        super(color, diameter, depth, shell);
    }

    @Override
    public void strike() {
        System.out.println("Dummmm.........");
    }
}
