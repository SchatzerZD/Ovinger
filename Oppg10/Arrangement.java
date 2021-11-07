import java.util.Random;

public class Arrangement{
  private final int ID;
  private String name;
  private String place;
  private String arranger;
  private String type;
  private long time;


  public Arrangement(String name, String place, String arranger, String type, long time){
    Random randomNr = new Random();
    int number = randomNr.nextInt() % 100000;
    if(number < 0){
      number *= -1;
      this.ID = number;
    }else{
      this.ID = number;
    }

    this.name = name;
    this.place = place;
    this.arranger = arranger;
    this.type = type;
    this. time = time;
  }

  public int getId(){
    return ID;
  }

  public String getName(){
    return name;
  }

  public String getPlace(){
    return place;
  }

  public String getArranger(){
    return arranger;
  }

  public String getType(){
    return type;
  }

  public long getTime(){
    return time;
  }

  public String toString(){
    return "\nID: " + this.getId() + " || Name: " + this.getName() + " || Place: " + this.getPlace() +
    "\nArranger: " + this.getArranger() + " || Type: " + this.getType() + " || Time: " + this.getTime();
  }

  public void printString(){
    System.out.println(this.toString());
  }


}
