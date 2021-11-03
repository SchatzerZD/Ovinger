import java.time.Year;

public class Boss{

  private Person personObject;
  private int bossNumber;
  private int hireYear;
  private double monthSalary;
  private double tax;

  public Boss(Person personObject, int bossNumber, int hireYear, double monthSalary, double tax){
    this.personObject = personObject;
    this.bossNumber = bossNumber;
    this.hireYear = hireYear;
    this.monthSalary = monthSalary;
    if(tax > 0 && tax < 1){
      this.tax = tax;
    }else{
      System.out.println("\n||TAX ERROR|| TAX SET TO DEFAULT (0.2)");
      this.tax = 0.2;
    }

  }

  public Person getPerson(){
    return personObject;
  }
  public int getBossNumber(){
    return bossNumber;
  }
  public int getHireYear(){
    return hireYear;
  }
  public double getMonthSalary(){
    return monthSalary;
  }
  public double getTax(){
    return tax;
  }


  public void setBossNumber(int number){
    bossNumber = number;
  }
  public void setHireYear(int year){
    hireYear = year;
  }
  public void setMonthSalary(double salary){
    monthSalary = salary;
  }
  public void setTax(double taxInput){

    if(taxInput > 0 && taxInput < 1){
      tax = taxInput;
    }else{
      System.out.println("\n||TAX ERROR|| TAX SET TO DEFAULT (0.2)");
      tax = 0.2;
    }

  }



  public double lostInTax(){
    return this.brutto() * tax;
  }

  public double brutto(){
    return monthSalary / (1.0 - tax);
  }

  public double lostInYearTax(){
    return (this.lostInTax() * 10) + (this.lostInTax() / 2);
  }

  public String fullName(){
    return personObject.getSurname() + ", " + personObject.getName();
  }

  public int age(){
    return Year.now().getValue() - personObject.getBirthYear();
  }

  public int workYears(){
    return Year.now().getValue() - hireYear;
  }

  public boolean isHiredMoreThan(int number){
    if(number < this.workYears()){
      return true;
    }else{
      return false;
    }
  }



}
