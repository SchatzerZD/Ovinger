import java.util.Random;

class MinRandom{
    private int min;
    private int max;
    public MinRandom(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int nesteHeltall(){
        Random number = new Random();
        int randomNumber = number.nextInt(max-min);
        randomNumber+= min;

        return randomNumber;
    }

    public double nesteDesimaltall(){
        Random number = new Random();
        double randomNumber = number.nextDouble()*(max-min);
        randomNumber+= min;

        return randomNumber;
    }


    public static void main(String[] args){
        MinRandom numberRange = new MinRandom(3, 7);

        int randomNumber = numberRange.nesteHeltall();
        System.out.println(randomNumber);

        randomNumber = numberRange.nesteHeltall();
        System.out.println(randomNumber);

        randomNumber = numberRange.nesteHeltall();
        System.out.println(randomNumber);

        double randomDecimal = numberRange.nesteDesimaltall();
        System.out.println(randomDecimal);

        randomDecimal = numberRange.nesteDesimaltall();
        System.out.println(randomDecimal);

        randomDecimal = numberRange.nesteDesimaltall();
        System.out.println(randomDecimal);
    }
}
