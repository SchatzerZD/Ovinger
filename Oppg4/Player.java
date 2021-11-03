import java.util.Random;

public class Player{
  private int points;
  private String name;


  public Player(int points, String name){
    this.points = points;
    this.name = name;
  }

  public int getPoints(){
    return points;
  }

  public String getName(){
    return name;
  }

  public int throwDice(){
    Random randomNumber = new Random();
    int diceNumber = randomNumber.nextInt(5);
    diceNumber += 1;

    return diceNumber;
  }

  public void doSumPoints(int points){
      int diceNumber = this.throwDice();

      if(diceNumber != 1){
      this.points += diceNumber;
    }else{
      this.points = 0;
    }
  }

  public boolean isFinish(){
    if(this.points >= 100){
      return true;
    }else{
      return false;
    }
  }

}
