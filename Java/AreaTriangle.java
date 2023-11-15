import java.util.Scanner;
import java.lang.Math;
class AreaTriangle{
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
        System.out.println("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        String coordinates = ui.nextLine();
        int x1num = coordinates.indexOf(" ");
        double x1 = Double.valueOf(coordinates.substring(0,x1num)); 
        //found the function Double.parseDouble() on https://www.digitalocean.com/community/tutorials/java-convert-string-to-double
        coordinates = coordinates.substring(x1num+1,coordinates.length());
        int y1num = coordinates.indexOf(" ");
        double y1 = Double.parseDouble(coordinates.substring(0,y1num));
        coordinates = coordinates.substring(y1num+1,coordinates.length());
        int x2num = coordinates.indexOf(" ");
        double x2 = Double.parseDouble(coordinates.substring(0,x2num));
        coordinates = coordinates.substring(x2num+1,coordinates.length());
        int y2num = coordinates.indexOf(" ");
        double y2 = Double.parseDouble(coordinates.substring(0,y2num));
        coordinates = coordinates.substring(y2num+1,coordinates.length());
        int x3num = coordinates.indexOf(" ");
        double x3 = Double.parseDouble(coordinates.substring(0,x3num));
        coordinates = coordinates.substring(x3num+1,coordinates.length());
        double y3 = Double.parseDouble(coordinates);
        double side1 = Math.sqrt((Math.pow((Math.abs(y2-y1)),2))+(Math.pow((Math.abs(x2-x1)),2)));
        double side2 = Math.sqrt((Math.pow((Math.abs(y3-y2)),2))+(Math.pow((Math.abs(x3-x2)),2)));
        double side3 = Math.sqrt((Math.pow((Math.abs(y3-y1)),2))+(Math.pow((Math.abs(x3-x1)),2)));
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        //found the Math.abs() function on https://www.geeksforgeeks.org/java-math-abs-method-examples/
        System.out.printf("The area of the triangle is %.2f",area);
        ui.close();
  }
}
