
public class Fraction{
  private int numerator;
  private int denominator;
  private String result;


  public Fraction(int numerator, int denominator){
    if(denominator == 0){
      throw new IllegalArgumentException("Nevneren kan ikke være 0");
    }else{
    this.numerator = numerator;
    this.denominator = denominator;
  }
}

  public Fraction(int numerator){
    this.numerator = numerator;
    this.denominator = 1;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public String getResult(){
    return result;
  }

  public void multiply(int n, int d){
    int numeratorResult = this.numerator * n;
    int denominatorResult = this.denominator * d;
    this.result = numeratorResult + "/" + denominatorResult;
  }

  public void division(int n, int d){
    int numeratorResult = this.numerator * d;
    int denominatorResult = this.denominator * n;
    this.result = numeratorResult + "/" + denominatorResult;
  }

  public void addition(int n, int d){
    int numeratorResult = (this.numerator * d) + (n * this.denominator);
    int denominatorResult = this.denominator * d;
    this.result = numeratorResult + "/" + denominatorResult;
  }

  public void subtraction(int n, int d){
    int numeratorResult = (this.numerator * d) - (n * this.denominator);
    int denominatorResult = this.denominator * d;
    this.result = numeratorResult + "/" + denominatorResult;
  }

}
