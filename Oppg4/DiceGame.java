

class DiceGame{
  public static void main(String[] args){
      int roundNr = 1;
      boolean finish = false;

      Player a = new Player(0, "A");
      Player b = new Player(0, "B");

      while(!finish){
        System.out.println("Rundet Nummer: " + roundNr);
        System.out.println("--------------------");
        System.out.println(" ");

        System.out.println("Spiller " + a.getName() + " sin tur!");
        a.doSumPoints(a.getPoints());
        System.out.println("Spiller " + a.getName() + " har " + a.getPoints() + " poeng");

        if(a.isFinish() == true){
          System.out.println("Spiller " + a.getName() + " har vunnet! :D");
          finish = true;
          break;
        }

        System.out.println("Spiller " + b.getName() + " sin tur!");
        b.doSumPoints(b.getPoints());
        System.out.println("Spiller " + b.getName() + " har " + b.getPoints() + " poeng");

        if(b.isFinish() == true){
          System.out.println("Spiller " + b.getName() + " har vunnet! :D");
          finish = true;
          break;
        }

        System.out.println(" ");
        System.out.println(" ");
        roundNr++;
      }

    }
}
