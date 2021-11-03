import java.util.Scanner;

class CurrencyCalc{

  public static void main(String[] args){

    boolean active = true;
    int numberOfCurrencies = 3;

    Currency[] currencyArray = new Currency[numberOfCurrencies];

    currencyArray[0] = new Currency("USD", 8.71);
    currencyArray[1] = new Currency("EUR", 10.22);
    currencyArray[2] = new Currency("SEK", 1);

    while(active == true){

      Scanner chooseCurrency = new Scanner(System.in);
      System.out.println("Velg Valuta:");

      for(var i = 1; i <= numberOfCurrencies; i++){
        System.out.println(i + ". " + currencyArray[i - 1].getName());
      }

      System.out.println((numberOfCurrencies + 1) + ". Avslutt");
      int currencyChosen = chooseCurrency.nextInt();

      if(currencyChosen <= numberOfCurrencies && currencyChosen >= 1){

        System.out.println(" ");

        Scanner chooseMethod = new Scanner(System.in);
        System.out.println("Velg hva du skal:");
        System.out.println("1. " + currencyArray[currencyChosen - 1].getName() + " til NOK");
        System.out.println("2. NOK til " + currencyArray[currencyChosen - 1].getName());
        int methodChosen = chooseMethod.nextInt();

        System.out.println(" ");

        Scanner moneyInput = new Scanner(System.in);
        System.out.println("Skriv inn antall:");
        double money = moneyInput.nextDouble();

        System.out.println("------------------");
        System.out.println(" ");




        if(methodChosen == 1){

          System.out.println(money + " " + currencyArray[currencyChosen - 1].getName() + " blir " + currencyArray[currencyChosen - 1].toNok(money) + " NOK");

        }else if(methodChosen == 2){

          System.out.println(money + " NOK blir " + currencyArray[currencyChosen - 1].fromNok(money) + " " + currencyArray[currencyChosen - 1].getName());

        }else{
          active = false;
        }

        System.out.println(" ");

      }else{
        active = false;
      }


      System.out.println("------------------");
      System.out.println(" ");
      System.out.println(" ");

    }

  }

}
