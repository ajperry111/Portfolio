import java.util.Scanner;
public class GPABellringer {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        double grade = ui.nextDouble();
        System.out.println("Enter a grade: ");
        double grade2 = ui.nextDouble(); 
        System.out.println("Enter a grade: ");
        double grade3 = ui.nextDouble();
        System.out.println("Enter a grade: ");
        double grade4 = ui.nextDouble();
        double gpa = grade+grade2+grade3+grade4;
        System.out.print(gpa/=4);
        ui.close();
    }
}
