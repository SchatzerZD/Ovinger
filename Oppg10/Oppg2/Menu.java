import java.util.ArrayList;

public class Menu{
  private ArrayList<Meal> meals;
  private String name;

  public Menu(String name){
    meals = new ArrayList<Meal>();
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public ArrayList<Meal> getAllMeals(){
    return meals;
  }

  public void registerNewMeal(Meal meal){
    boolean unique = true;
    for(var i=0; i<meals.size(); i++){
      if(meals.get(i).getName().equals(meal.getName())){
        unique = false;
      }
    }
    if(unique){
      meals.add(meal);
    }else{
      System.out.println("Meal already exists");
    }
  }

  public String getAllMealsByType(String type){
    String finalString = "";
    boolean typeFound = false;
    for(var i=0; i<meals.size();i++){
      if(meals.get(i).getType().equals(type)){
        finalString += meals.get(i).toString() + "\n";
        typeFound = true;
      }
    }
    if(typeFound){
      return finalString;
    }else{
      return "No meals were found by that type";
    }
  }

  public String searchForMeal(String name){
    for(var i=0; i<meals.size(); i++){
      if(meals.get(i).getName().equals(name)){
        return meals.get(i).toString();
      }
    }
    return "No meal was found with that name";
  }

  public double getTotalPrice(){
    double totalPrice = 0;
    for(var i=0;i<meals.size();i++){
      totalPrice += meals.get(i).getPrice();
    }
    return totalPrice;
  }


  public String toString(){
    String finalString = "--Menu: " + this.getName() + "--\n";
    for(var i=0; i<meals.size(); i++){
      finalString += meals.get(i).toString() + "\n";
    }
    return finalString;
  }


}
