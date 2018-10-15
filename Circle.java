public class Circle {
	
    protected int x;
    protected int y;
    protected int radius;
    
    public Circle() {
        this(0,0,0);
    }
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle other = (Circle) o;
            return x==other.x && y==other.y && radius==other.radius;
        } else {
            return false;
        }
    }
    
 
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
    
    public String toString() {
        return "Center: (" + x + "," + y + ") | Radius: " + radius + " | Color: ";
    }
    public void print() {
        System.out.println("Center: (" + x + "," + y + ") | Radius: " + radius + " | Color: ");
    }
    
    public double area() {
        return Math.PI*(radius*radius);
    }
    
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}