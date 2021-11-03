import java.util.Scanner;

class TimeToSeconds{
    public static void main(String[] args){
        
        Scanner inputHours = new Scanner(System.in);
        System.out.println("Skriv inn antall timer:");
        int hours = inputHours.nextInt();
        

        Scanner inputMinutes = new Scanner(System.in);
        System.out.println("Skriv inn antall minutter:");
        int minutes = inputMinutes.nextInt();
        

        Scanner inputSeconds = new Scanner(System.in);
        System.out.println("Skriv inn antall sekunder:");
        int seconds = inputSeconds.nextInt();
        

        int timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println(hours + "h " + minutes + "m " + seconds + "s i sekunder er: " + timeInSeconds);

        inputHours.close();
        inputMinutes.close();
        inputSeconds.close();
    }
}