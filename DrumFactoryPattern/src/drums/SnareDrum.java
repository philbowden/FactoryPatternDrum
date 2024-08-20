package drums;

public class SnareDrum extends Drum {

    public SnareDrum(String color, int diameter, double depth, String shell) {
        super(color, diameter, depth, shell);
    }

    @Override
    public void strike() {
        System.out.println("Rata Tat Tat!");
    }
}
