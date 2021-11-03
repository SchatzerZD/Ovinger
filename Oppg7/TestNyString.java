
class TestNyString{
  public static void main(String[] args) {

    String testString = "yo jeg heter daniel";

    NyString testClass = new NyString(testString);

    System.out.println(testClass.getText());
    System.out.println(testClass.forShortening());
    System.out.println(testClass.removeChar("e"));

  }
}
