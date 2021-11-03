import java.util.*;
import java.lang.*;

class TextBot{
  public static void main(String[] args){

    while(true){

      Scanner textInput = new Scanner(System.in);
      System.out.println("Skriv tekst:");
      String text = textInput.nextLine();

      Text t = new Text(text);
      t.tableCreate();

//    System.out.println(Arrays.toString(t.getCharacterArray()));
//    t.printTableOfChar();
      System.out.println("-------------------------------\n");

      System.out.println("Antall forskjellige bokstaver: " + t.getDiffLetters());
      System.out.println("Antall totale bokstaver: " + t.getTotalLetters());
      System.out.println("Prosent av hvor mange tegn som ikke er bokstaver: " + t.getNotLetterPercent() + "%");
      System.out.println("Bokstaven/Bokstavene det er mest av: " + t.getMostFreqLetter());

      System.out.println("-------------------------------\n");

      Scanner letterInput = new Scanner(System.in);
      System.out.println("Hvilken bokstav vil du vite hvor mange det er av i teksten?");
      String letter = letterInput.nextLine();
      System.out.println("Antall ganger bokstaven " + letter + " er i teksten: " + t.getLetterOcc(letter));
      System.out.println("\n");


    }


  }
}
