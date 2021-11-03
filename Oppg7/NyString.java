
public final class NyString{

  private final String text;

  public NyString(String text){
    this.text = text;
  }

  public String getText(){
    return text;
  }

  public String forShortening(){
    String[] textArray = text.split(" ");
    String newText = "";

    for(var i=0;i<textArray.length;i++){
      newText += Character.toString(textArray[i].charAt(0));
    }

    return newText;

  }

  public String removeChar(String c){
    String textCopy = text;
    String removedChar = textCopy.replaceAll(c,"");

    return removedChar;

  }

}
