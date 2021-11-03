
public class Text{

  private String text;

  public Text(String text){
    this.text = text;
  }

  public String getText(){
    return text;
  }

  public String getCapitalizedText(){
    return text.toUpperCase();
  }

  public int numberOfWords(){
    String[] textArray = text.split(" ");
    int wordCount = textArray.length;
    return wordCount;
  }

  public double averageWordLength(){
    double wordCount = this.numberOfWords();
    double totalLetterCount = text.strip().replaceAll("[.?!-,]","").length();
    return totalLetterCount / wordCount;
  }

  public double wordPerPeriod(){
    double wordCount = this.numberOfWords();
    double periodCount = text.split("[.!:?]").length;
    return wordCount / periodCount;
  }

  public void replaceWord(String word, String replacement){
    text = text.replaceAll(word, replacement);
  }






  String text = "Hei allesammen ok";
  String[] ordArray = text.split(" ");
  System.out.println(ordArray);

}
