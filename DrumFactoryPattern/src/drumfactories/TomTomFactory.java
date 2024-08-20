package drumfactories;

import drums.Drum;
import drums.TomTom;

public class TomTomFactory implements DrumFactory {
    @Override
    public Drum createDrum(String color, int diameter, double depth, String shell) {
        System.out.println("making a tom!");
        return new TomTom(color, diameter, depth, shell);
    }
}
