import java.util.Scanner;
class TimeAway {
  public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    System.out.println("Enter the number of minutes: ");
    int mins = ui.nextInt();
    int minutes = mins;
    System.out.println(mins);
    int days = (minutes%=525600)/1440;
    int years = mins/525600;
    System.out.printf("%d minutes is approximately %d years and %d days",mins,years,days);
  }
}
