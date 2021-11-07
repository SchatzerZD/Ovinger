import java.util.ArrayList;

public class MenuRegister{
  private ArrayList<Menu> menus;


  public MenuRegister(){
    menus = new ArrayList<Menu>();
  }

  public void registerNewMeal(Meal meal, Menu menu){
    menu.registerNewMeal(meal);
  }

  public void findMeal(String name){
    boolean mealFound = false;
    for(var i=0;i<menus.size();i++){
      if(menus.get(i).searchForMeal(name).equals("No meal was found with that name") == false){
          System.out.println("--Menu: " + menus.get(i).getName() + "--\n" + menus.get(i).searchForMeal(name));
          mealFound = true;
      }
    }
    if(mealFound == false){
      System.out.println("No meal was found with that name");
    }
  }

  public void findMealByType(String type){
    boolean typeFound = false;
    for(var i=0;i<menus.size();i++){
      if(menus.get(i).getAllMealsByType(type).equals("No meals were found by that type") == false){
        System.out.println("--Menu: " + menus.get(i).getName() + "--\n" + menus.get(i).getAllMealsByType(type));
        typeFound = true;
      }
    }
    if(typeFound == false){
      System.out.println("No meals were found by that type");
    }
  }

  public void registerNewMenu(Menu newMenu){
    if(menus.add(newMenu)){
      System.out.println(newMenu.getName() + " added");
    }else{
      System.out.println("Something went wrong");
    }
  }

  public void findMenusByPrice(double firstPrice, double lastPrice){
    for(var i=0;i<menus.size();i++){
      if(menus.get(i).getTotalPrice() >= firstPrice && menus.get(i).getTotalPrice() <= lastPrice){
        System.out.println(menus.get(i).toString());
      }
    }
  }

  public String toString(){
    String finalString = "";
    for(var i=0;i<menus.size();i++){
      finalString += i + ": " + menus.get(i).getName() + "\n";
    }
    return finalString;
  }
}
