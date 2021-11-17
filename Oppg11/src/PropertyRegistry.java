import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Scanner;

public class PropertyRegistry {

    /***
     * Bruker Arraylist fordi det er ukjent lengde på listen
     */
    private ArrayList<Property> property;


    public PropertyRegistry(){
        property = new ArrayList<Property>();
    }

    public void registerProperty(int communeNumber, String communeName, int lotNumber, int sectionNumber, String name, double area, String nameOfOwner){
        if(name.equals("")){
            name = "No name";
        }
        Property newProperty = new Property(communeNumber,communeName,lotNumber,sectionNumber,name,area,nameOfOwner);
        property.add(newProperty);
    }

    public void deleteProperty(){
        for (int i = 0; i < property.size(); i++) {
            System.out.println(i + ": " + property.get(i).id());
        }
        Scanner i = new Scanner(System.in);
        System.out.println("Input index of property you want to delete:");
        int input = i.nextInt();

        property.remove(input);

    }

    public int totalProperties(){
        return property.size();
    }

    public String findProperty(int communeNumber, int lotNumber ,int sectionNumber){
        String id = communeNumber + "-" + lotNumber + "/" + sectionNumber;

        for (int i = 0; i < property.size(); i++) {
            if(property.get(i).id().equals(id)){
                return property.get(i).toString();
            }
        }

        return "No property was found";
    }

    public double averageArea(){
        double totalArea = 0;
        for (int i = 0; i < property.size(); i++) {
            totalArea += property.get(i).getArea();
        }
        return totalArea/property.size();
    }

    public ArrayList<Property> findPropertiesByLotNumber(int lotNumber){
        ArrayList<Property> propertyList = new ArrayList<Property>();

        for (int i = 0; i < property.size(); i++) {
            if(property.get(i).getLotNumber() == lotNumber){
                propertyList.add(property.get(i));
            }
        }

        return propertyList;
    }

    @Override
    public String toString() {
        String finalString = "";
        for (int i = 0; i < property.size(); i++) {
            finalString += property.get(i).toString() + "\n\n";
        }
        return finalString;
    }
}

