import java.util.Scanner;

class SecondsToTime{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv inn antall sekunder:");
        double secondsInput = in.nextDouble();
        
        double minutes = (secondsInput/60)%60;
        double hours = (secondsInput/3600);
        double seconds = (minutes - (int)minutes) * 60;
        
        System.out.println((int)secondsInput + " sekunder er: " + (int)hours + "h " + (int)minutes + "m " + (int)seconds + "s");

        in.close();
    }
}
