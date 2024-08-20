package drumfactories;

import drums.Drum;
import drums.KickDrum;

public class KickDrumFactory implements DrumFactory {

    @Override
    public Drum createDrum(String color, int diameter, double depth, String shell) {
        return new KickDrum(color, diameter, depth, shell);
    }
}
