
class FractionCalc{

  public static void main(String[] args){

    Fraction a = new Fraction(3,2);
    Fraction b = new Fraction(2,3);

    a.multiply(b.getNumerator(),b.getDenominator());
    System.out.println(a.getResult());

    System.out.println(" ");
    System.out.println("--------------");
    System.out.println(" ");

    a.addition(b.getNumerator(),b.getDenominator());
    System.out.println(a.getResult());

    System.out.println(" ");
    System.out.println("--------------");
    System.out.println(" ");

    a.division(b.getNumerator(),b.getDenominator());
    System.out.println(a.getResult());

    System.out.println(" ");
    System.out.println("--------------");
    System.out.println(" ");

    a.subtraction(b.getNumerator(),b.getDenominator());
    System.out.println(a.getResult());

    System.out.println(" ");
  }
}
