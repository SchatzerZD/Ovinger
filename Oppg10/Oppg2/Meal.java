public class Meal{
  private String name;
  private String type;
  private double price;
  private String[] recipeList;
  private String recipe = "";

  public Meal(String name, String type, double price, String[] recipeList){
    this.name = name;
    this.type = type;
    this.price = price;
    this.recipeList = recipeList;

    for(var i=0; i<recipeList.length; i++){
      recipe += recipeList[i] + "| ";
    }

    this.recipe = recipe;
  }

  public String getName(){
    return name;
  }

  public String getType(){
    return type;
  }

  public double getPrice(){
    return price;
  }

  public String getRecipe(){
    return recipe;
  }

  public String toString(){
    return "Name: " + this.getName() + " || Type: " + this.getType() + " || Price: " + this.getPrice() + "kr\nRecipe:" + this.getRecipe();
  }


}
