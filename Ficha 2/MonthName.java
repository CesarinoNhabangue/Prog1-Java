import java.util.Scanner;

public class MonthName {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the month number: ");
    int monthNumber = scanner.nextInt();

    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    System.out.println("The name of the month is " + months[monthNumber - 1]);
    scanner.close();
  }
}
