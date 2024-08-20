package drumfactories;

import drums.Drum;
import drums.SnareDrum;

public class SnareDrumFactory implements DrumFactory {

    @Override
    public Drum createDrum(String color, int diameter, double depth, String shell) {
        return new SnareDrum(color, diameter, depth, shell);
    }
}
