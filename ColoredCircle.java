public class ColoredCircle extends Circle implements Colored{
   
	protected String color;
    
	public ColoredCircle() {
        this(0,0,0,"");
    }
	
    public ColoredCircle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    
    public boolean equals(Object o) {
        if (o instanceof ColoredCircle) {
            ColoredCircle other = (ColoredCircle) o;
            return x == other.x && y == other.y && radius == other.radius && color == other.color;
        } else {
            return false;
        }
    }
    
	public String getColor() {
		return color;
	}
	
    public String toString() {
        return "Center: (" + x + "," + y + ") | Radius: " + radius + " | Color: " + color;
    }
    public void print() {
        System.out.println("Center: (" + x + "," + y + ") | Radius: " + radius + " | Color: " + color);
    }
}
   