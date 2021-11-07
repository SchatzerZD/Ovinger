class Main{
  public static void main(String[] args){

    MenuRegister menuList = new MenuRegister();

    String[] recipe1 = {"Egg", "Soya", "Wheat"};
    String[] recipe2 = {"Egg", "Soya", "Wheat", "Chicken"};
    String[] recipe3 = {"Soya", "Beans"};
    String[] recipe4 = {"Rice", "Soya", "Wheat"};
    String[] recipe5 = {"Egg", "Soya", "Wheat"};
    String[] recipe6 = {"Wheat", "Milk"};

    Meal meal1 = new Meal("name1", "type1", 24.3, recipe1);
    Meal meal2 = new Meal("name2", "type2", 50.2, recipe2);
    Meal meal3 = new Meal("name3", "type1", 22.2, recipe3);
    Meal meal4 = new Meal("name4", "type3", 20.2, recipe4);
    Meal meal5 = new Meal("name5", "type3", 14.5, recipe5);
    Meal meal6 = new Meal("name6", "type2", 66.5, recipe6);

    Menu menu1 = new Menu("menu1");
    Menu menu2 = new Menu("menu2");
    Menu menu3 = new Menu("menu3");

    menu1.registerNewMeal(meal1);
    menu1.registerNewMeal(meal2);
    menu2.registerNewMeal(meal3);
    menu2.registerNewMeal(meal4);
    menu3.registerNewMeal(meal5);

    menuList.registerNewMenu(menu1);
    menuList.registerNewMenu(menu2);
    menuList.registerNewMenu(menu3);

    menuList.registerNewMeal(meal6, menu3);
    System.out.println("\n");

    menuList.findMeal("name6");
    System.out.println("\n");

    menuList.findMealByType("type1");
    menuList.findMealByType("type4");
    System.out.println("\n");

    menuList.findMenusByPrice(50, 90);

  }
}
