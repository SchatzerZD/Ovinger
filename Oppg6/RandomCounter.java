import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class RandomCounter{
  public static void main(String[] args){
    int grense = 10;

    Random random = new Random();

    Scanner userInput = new Scanner(System.in);
    System.out.println("Antall ganger tallene " + 0 + "-" + (grense-1) + " skal randomizes:");
    int loopRounds = userInput.nextInt();

    int[] randomNumberArray = new int[loopRounds];

    for(var i=0;i<loopRounds;i++){
      int randomNumber = random.nextInt(grense);
      randomNumberArray[i] = randomNumber;
    }
//    System.out.println(Arrays.toString(randomNumberArray));

    for(var i=0;i<grense;i++){
      int count = 0;
      double numberOfStars = 0;
      for(var j=0;j<randomNumberArray.length;j++){
        if(i == randomNumberArray[j]){
          count++;
        }
      }
      numberOfStars = (Math.round(count/10.0)*10)/10;
      String starLine = "";
      for(var n=0;n<numberOfStars;n++){
        starLine += "*";
      }
      System.out.printf("%2d : %3d %-20s",i,count,starLine);
      System.out.println("");
    }



  }
}
