import java.util.Scanner;

class InchToCent{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn antall tommer:");
        double inches = in.nextDouble();

        double centimeters = inches * 2.54;
        System.out.println(inches + " tommer i centimeter er " + centimeters);
        in.close();
    }
}
