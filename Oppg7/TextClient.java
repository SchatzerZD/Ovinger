
class TextClient{
  public static void main(String[] args) {

    String testText = "Yes this is a text. Ok? why not. Ok";

    Text testClass = new Text(testText);

    System.out.println("Text: " + testClass.getText());
    System.out.println("Capitalized text: " + testClass.getCapitalizedText());
    System.out.println("Word count: " + testClass.numberOfWords());
    System.out.println("Average word length: " + testClass.averageWordLength());
    System.out.println("Word per period: " + testClass.wordPerPeriod());

    testClass.replaceWord("Ok","cool");
    System.out.println("Replaced 'Ok' with 'cool': " + testClass.getText());

  }
}
