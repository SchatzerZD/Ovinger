import java.util.Calendar;

public class Arrangement{
  private final long ID;
  private String name;
  private String place;
  private String arranger;
  private String type;
  private long time;


  public Arrangement(String name, String place, String arranger, String type, long time){
    this.ID = Calendar.getTimeInMillis()
    this.name = name;
    this.place = place;
    this.arranger = arranger;
    this.type = type;
    this. time = time;
  }

  public long getId(){
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
    return Type;
  }

  public long getTime(){
    return time;
  }

  public String toString(){
    return "ID: " + this.getId() + " || Name: " + this.getName() + " || Place: " + this.getPlace() +
    "\n Arranger: " + this.getArranger() + " || Type: " + this.getType() + " || Time: " + this.getTime();
  }

  public void printString(){
    System.out.println(this.toString());
  }


}
