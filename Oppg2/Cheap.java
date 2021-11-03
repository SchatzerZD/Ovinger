import java.util.Scanner;


class Cheap{
  public static void main(String[] args){

    double aPrice = 35.9;
    int aWeight = 450;

    double bPrice = 39.5;
    int bWeight = 500;

    double aPricePerWeight = aPrice/aWeight;
    double bPricePerWeight = bPrice/bWeight;

    if(aPricePerWeight > bPricePerWeight){
      System.out.println("Kjottdeig B er billigere");
    }else{
      System.out.println("Kjottdeig A er billigere");
    }

  }
}
