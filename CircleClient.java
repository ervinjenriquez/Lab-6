public class CircleClient
{
   public static void main (String[] args) {

       System.out.print("Red circle: ");
       ColoredCircle red = new ColoredCircle(9,28,18,"red");
       red.print();
       System.out.print("Blue circle: ");
       ColoredCircle blue = new ColoredCircle(8,24,17, "blue");
       blue.print();
       
       System.out.println("T/F: Is the red circle equal to the blue circle?: " + red.equals(blue));
       
       System.out.println();
       
       System.out.print("White circle: ");
       ColoredCircle white = new ColoredCircle(3,16,18,"white");
       white.print();
       System.out.print("Blanco circle: ");
       ColoredCircle blanco = new ColoredCircle(3,16,18, "white");
       blanco.print();
       
       System.out.println("T/F: Is white circle equal to blanco circle?: " + white.equals(blanco));
    }
   }
