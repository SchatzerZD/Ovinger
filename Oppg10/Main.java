import java.util.Scanner;

class Main{
  public static void main(String[] args){

    Arrangement e3 = new Arrangement("E3", "Calefornia", "Daniel INS", "Game Event", 202206121600L);
    Arrangement christmas = new Arrangement("Christmas", "Home", "Santa Clause", "Holiday", 202112240000L);
    Arrangement concert1 = new Arrangement("Concert1", "Trondheim", "MJ", "Concert", 202201141600L);
    Arrangement concert2 = new Arrangement("Concert2", "Trondheim", "MJ", "Concert", 202201151600L);
    Arrangement concert3 = new Arrangement("Concert3", "Trondheim", "MJ", "Concert", 202201161600L);

    //System.out.println(e3.toString());
    //System.out.println(christmas.toString());

    ArrangementRegister arrangementList = new ArrangementRegister();

    arrangementList.registerArrangement(e3);
    arrangementList.registerArrangement(christmas);
    arrangementList.registerArrangement(concert1);
    arrangementList.registerArrangement(concert2);
    arrangementList.registerArrangement(concert3);

    boolean loop = true;

    while(loop){
      Scanner menu = new Scanner(System.in);
      System.out.println("\n1: Register arrangement\n2: Find arrangement by place\n3: Find arrangement by date(yyyymmdd)\n4: Find arrangments between dates\n5: List of all arrangements\n6: Close");
      int menuInput = menu.nextInt();

      switch(menuInput){
        case 1:
          arrangementList.registerArrangement(register());
          break;
        case 2:
          arrangementList.findArrangementByPlace(stringInput());
          break;
        case 3:
          arrangementList.findArrangementByDate(intInput());
          break;
        case 4:
          arrangementList.findArrangementBetweenDates(intInput(), intInput());
          break;
        case 5:
          arrangementList.printArrangements(arrangementList.listOfAllArrangements());
          break;
        case 6:
          loop = false;
      }
    }

    

  }

  public static Arrangement register(){
    System.out.println("Name:");
    String name = stringInput();
    System.out.println("Place:");
    String place = stringInput();
    System.out.println("Arranger:");
    String arranger = stringInput();
    System.out.println("Type:");
    String type = stringInput();
    System.out.println("Time(yyyymmddhhmm):");
    long time = longInput();
    return new Arrangement(name, place, arranger, type, time);
  }

  public static String stringInput(){
    Scanner input = new Scanner(System.in);
    return input.nextLine();
  }
  public static long longInput(){
    Scanner input = new Scanner(System.in);
    return input.nextLong();
  }

  public static int intInput(){
    Scanner input = new Scanner(System.in);
    return input.nextInt();
  }

}
