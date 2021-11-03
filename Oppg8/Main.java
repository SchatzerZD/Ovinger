import java.util.Scanner;


class Main{
  public static void main(String[] args) {

    Person daniel = new Person("Daniel","Saren",2001);
    Boss work = new Boss(daniel,57485,2018,8689,0.2);


    while(true){
      printInfo(work);
      System.out.println("\n\n");

      Scanner input = new Scanner(System.in);
      System.out.println("1. Set boss number");
      System.out.println("2. Set year hired");
      System.out.println("3. Set month salary");
      System.out.println("4. Set tax (0-1)");
      int numberInputed = input.nextInt();

      switch(numberInputed){
        case 1:
          work.setBossNumber(scannerInputInt());
          break;
        case 2:
          work.setHireYear(scannerInputInt());
          break;
        case 3:
          work.setMonthSalary(scannerInputDouble());
          break;
        case 4:
          work.setTax(scannerInputDouble());
          break;
      }

      System.out.println("\n\n");

    }
  }

  static void printInfo(Boss work){
    int yearDifference = 5;
    System.out.println("Boss number: " + work.getBossNumber() + " | " + "Year hired: " + work.getHireYear() + " | " + "Salary: " + work.getMonthSalary() + " | " + "Tax: " + work.getTax() + "\n");

    System.out.println("Lost in tax: " + work.lostInTax());
    System.out.println("Brutto: " + work.brutto());
    System.out.println("Tax in a year: " + work.lostInYearTax());
    System.out.println("Name: " + work.fullName());
    System.out.println("Age: " + work.age());
    System.out.println("Years in work: " + work.workYears());
    System.out.println("Is hired more than " + yearDifference + " years: " + work.isHiredMoreThan(yearDifference));
  }

  static int scannerInputInt(){
    Scanner input = new Scanner(System.in);
    System.out.println("Set number:");
    int numberInputed = input.nextInt();
    return numberInputed;
  }

  static double scannerInputDouble(){
    Scanner input = new Scanner(System.in);
    System.out.println("Set number:");
    double numberInputed = input.nextDouble();
    return numberInputed;
  }


}
