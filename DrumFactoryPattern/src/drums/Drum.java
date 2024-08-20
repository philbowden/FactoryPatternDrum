package drums;

public abstract class Drum {
    private String color;
    private int diameter;
    private double depth;
    private String shellType;

    public String getColor() {
        return color;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getDepth() {
        return depth;
    }

    public String getShellType() {
        return shellType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    public Drum(String color, int diameter, double depth, String shellType) {
        this.color = color;
        this.diameter = diameter;
        this.depth = depth;
        this.shellType = shellType;
    }

    public void strike() {}
    public void getSpecs() {
        System.out.println("DETAILS");
        System.out.println("Color: " + this.getColor());
        System.out.println("Diameter: " + this.getDiameter());
        System.out.println("Depth: " + this.getDepth());
        System.out.println("Shell Type: " +  this.getShellType());
    }
}
