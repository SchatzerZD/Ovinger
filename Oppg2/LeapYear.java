import java.util.Scanner;

class LeapYear{
  public static void main(String[] args){
    Scanner checkYear = new Scanner(System.in);
    System.out.println("Year: ");
    int year = checkYear.nextInt();

    if(year%4 == 0 && year%100 != 0 || year%400 == 0){
      System.out.println("Its a leap year!");
    }else{
      System.out.println("Its not a leap year!");
    }

  }
}
