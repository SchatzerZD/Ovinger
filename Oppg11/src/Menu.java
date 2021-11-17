import java.util.ArrayList;
import java.util.Scanner;
public class Menu {

    // Constants representing the different menu choices
    private final int ADD_PROPERTY = 1;
    private final int LIST_ALL_PROPERTIES = 2;
    private final int FIND_PROPERTY = 3;
    private final int CALCULATE_AVERAGE_AREA = 4;
    private final int DELETE_PROPERTY = 5;
    private final int LOT_NUMBER_SEARCH = 6;
    private final int EXIT = 9;

    /**
     * Presents the menu for the user, and awaits input from the user. The menu
     * choice selected by the user is being returned.
     *
     * @return the menu choice by the user as a positive number starting from 1.
     * If 0 is returned, the user has entered a wrong value
     */
    private int showMenu()
    {
        int menuChoice = 0;
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property by ID");
        System.out.println("4. Calculate average area");
        System.out.println("5. Delete Property");
        System.out.println("6. Search for property by lot number");
//TODO: Add more menus
        System.out.println("9. Quit");
        System.out.println("\nPlease enter a number between 1 and 9.\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }

    private int getInt(String displayMessage){
        Scanner sc = new Scanner(System.in);
        System.out.println(displayMessage);
        return sc.nextInt();
    }

    private String getString(String displayMessage){
        Scanner sc = new Scanner(System.in);
        System.out.println(displayMessage);
        return sc.nextLine();
    }

    private double getDouble(String displayMessage){
        Scanner sc = new Scanner(System.in);
        System.out.println(displayMessage);
        return sc.nextDouble();
    }

    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user,
     * and executing the selected functionality.
     */
    public void start() {
        boolean finished = false;
        PropertyRegistry propertyRegistry = new PropertyRegistry();

        propertyRegistry.registerProperty(1445, "Gloppen",77,631,"",1017.6,"Jens Olsen");
        propertyRegistry.registerProperty(1445, "Gloppen",77,131,"Syningom",661.3,"Nicolay Madsen");
        propertyRegistry.registerProperty(1445,"Gloppen",75,19,"Fugletun",650.6,"Evilyn Jensen");
        propertyRegistry.registerProperty(1445,"Gloppen",74,188,"",1457.2,"Karl Ove Bråten");
        propertyRegistry.registerProperty(1445,"Gloppen",69,47,"Høiberg",1339.4, "Elsa Indregård");

// The while-loop will run as long as the user has not selected
// to quit the application
        while (!finished) {
            int menuChoice = this.showMenu();
            switch (menuChoice)
            {
                case ADD_PROPERTY:
                    propertyRegistry.registerProperty(this.getInt("Commune Number:"), this.getString("Commune Name:"), this.getInt("Lot Number:"), this.getInt("Section Number:"), this.getString("Name:"), this.getDouble("Area:"), this.getString("Name of the owner:"));
                    break;
                case LIST_ALL_PROPERTIES:
                    System.out.println(propertyRegistry.toString());
                    break;
                case FIND_PROPERTY:
                    System.out.println(propertyRegistry.findProperty(this.getInt("Commune Number:"), this.getInt("Lot Number:"), this.getInt("Section Number:")));
                    break;
                case CALCULATE_AVERAGE_AREA:
                    System.out.println(propertyRegistry.averageArea());
                    break;
                case DELETE_PROPERTY:
                    propertyRegistry.deleteProperty();
                    break;
                case LOT_NUMBER_SEARCH:
                    ArrayList<Property> lotPropertyList = propertyRegistry.findPropertiesByLotNumber(this.getInt("Lot Number:"));
                    System.out.println(lotPropertyList);
                    break;
                case EXIT:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }
}
