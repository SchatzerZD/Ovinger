import java.util.*;
import java.lang.*;

public class Text{
  private String textBody;

  private int[] numberOfCharacters = new int[30];
  private static String[] allCharacters = new String[]{"A","B","C","D","E","F","G",
                                                      "H","I","J","K","L","M","N",
                                                      "O","P","Q","R","S","T","U",
                                                      "V","W","X","Y","Z","Æ","Ø","Å"};


  public Text(String textBody){
    this.textBody = textBody;
  }

  public String getText(){
    return textBody;
  }

  public int[] getCharacterArray(){
    return numberOfCharacters;
  }

  public void printTableOfChar(){
    for(var i=0;i<allCharacters.length;i++){
      if(numberOfCharacters[i] > 0){
        System.out.printf("%s : %3d%n",allCharacters[i],numberOfCharacters[i]);
      }
    }
  }

public int getDiffLetters(){
  int count = 0;

  for(var i=0;i<allCharacters.length;i++){
    if(numberOfCharacters[i] > 0){
      count++;
    }
  }

  return count;
}

public int getTotalLetters(){
  int count = 0;

  for(var i=0;i<allCharacters.length;i++){
    count += numberOfCharacters[i];
  }

  return count;
}

public double getNotLetterPercent(){
  double totalCharacters = textBody.length();
  double notLetterPercent = ((numberOfCharacters[numberOfCharacters.length-1])/(totalCharacters))*100;
  return notLetterPercent;
}

public int getLetterOcc(String letter){
  int letterOcc = 0;
  letter = letter.toUpperCase();

  for(var i=0;i<allCharacters.length;i++){
    if(letter.equals(allCharacters[i]) == true){
      letterOcc += numberOfCharacters[i];
    }
  }

  return letterOcc;
}

  public String getMostFreqLetter(){
    int[] copyArray = Arrays.copyOf(numberOfCharacters,numberOfCharacters.length);
    Arrays.sort(copyArray);
    int largestNumber = copyArray[copyArray.length - 1];
    String[] freqChar = new String[]{};
    String finalString = "";

    for(var i=0;i<allCharacters.length;i++){
      if(numberOfCharacters[i] == largestNumber){
        freqChar = Arrays.copyOf(freqChar, freqChar.length + 1);
        freqChar[freqChar.length -1] = allCharacters[i];
      }
    }

    for(var j=0;j<freqChar.length;j++){
      finalString += freqChar[j];
      finalString += " ";
    }

    return finalString;

  }

  public void tableCreate(){
    textBody = textBody.toUpperCase();

    for(var i=0;i<textBody.length();i++){
      int count = 0;
      for(var j=0;j<allCharacters.length;j++){
        if(allCharacters[j].equals(Character.toString((char)textBody.charAt(i))) == true){
          count += 1;
          numberOfCharacters[j] += count;
        }
      }
      if(count == 0){
        numberOfCharacters[29] += 1;
      }

    }
  }




}
