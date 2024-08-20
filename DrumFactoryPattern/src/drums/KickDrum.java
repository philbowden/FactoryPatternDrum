package drums;

public class KickDrum extends Drum {
    public KickDrum(String color, int diameter, double depth, String shell) {
        super(color, diameter, depth, shell);
    }

    @Override
    public void strike() {
        System.out.println("BOOM!!!!");
    }
}
