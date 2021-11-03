

public class Currency{
  private String name;
  private double value;

  public Currency(String name, double value){
    this.name = name;
    this.value = value;
  }

  public String getName(){
    return name;
  }

  public double getValue(){
    return value;
  }

  public double toNok(double nok){
    return (nok * value);
  }

  public double fromNok(double nok){
    return (nok / value);
  }


}
