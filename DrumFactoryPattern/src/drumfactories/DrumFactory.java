package drumfactories;

import drums.Drum;

public interface DrumFactory {
    public Drum createDrum(String color, int diameter, double depth, String shell);
}
