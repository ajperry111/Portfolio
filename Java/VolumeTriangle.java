import java.util.Scanner;
import java.lang.Math;
class VolumeTriangle {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    System.out.println("Enter length of the sides and height of the Equilateral triangle: ");
    double sides = ui.nextDouble();
    double area = ((Math.sqrt(3))/4)*(Math.pow(sides,2));
    double volume = area*sides;
    System.out.printf("The area is %.2f \nThe volume of the Triangular prism is %.2f",area,volume);
    ui.close();
  }
}
