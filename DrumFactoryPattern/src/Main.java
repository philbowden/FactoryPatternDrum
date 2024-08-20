import drumfactories.DrumFactory;
import drumfactories.KickDrumFactory;
import drumfactories.SnareDrumFactory;
import drums.Drum;

public class Main {
    public static void main(String[] args) {
        DrumFactory snareFactory = new SnareDrumFactory();
        Drum snare = snareFactory.createDrum("red", 14, 6.5, "maple");
        snare.strike();
        snare.getSpecs();
        System.out.println("##############################################");
        DrumFactory kickFactory = new KickDrumFactory();
        Drum kick = kickFactory.createDrum("red", 26, 14.0, "maple");
        kick.strike();
        kick.getSpecs();
        kick.setDiameter(22);
        kick.setColor("pink");
        kick.getSpecs();
    }
}