public class Property {

    private int communeNumber;
    private String communeName;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private double area;
    private String nameOfOwner;

    public Property(int communeNumber, String communeName, int lotNumber, int sectionNumber, String name, double area, String nameOfOwner) {
        if(communeNumber >= 101 && communeNumber <= 5054){
            this.communeNumber = communeNumber;
        }else{
            throw new IllegalArgumentException();
        }
        this.communeName = communeName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.nameOfOwner = nameOfOwner;
    }

    public Property(int communeNumber, String communeName, int lotNumber, int sectionNumber, double area, String nameOfOwner) {
        if(communeNumber >= 101 && communeNumber <= 5054){
            this.communeNumber = communeNumber;
        }else{
            throw new IllegalArgumentException();
        }

        this.communeName = communeName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.area = area;
        this.nameOfOwner = nameOfOwner;

        this.name = "No name";
    }

    public int getCommuneNumber() {
        return communeNumber;
    }

    public String getCommuneName() {
        return communeName;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    /***
     * Setter navnet til eindommen fordi navnet kan endre seg
     * @param name Navnet til eindommen
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * Setter navnet til eieren av eindommen, fordi eindommen kan få forskjellige eiere
     * @param nameOfOwner Navnet til eieren av eindommen
     */
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String id(){
        return communeNumber + "-" + lotNumber + "/" + sectionNumber;
    }

    @Override
    public String toString() {
        return "---Property: " + name + "---\n" +
                "Municipality name: " + communeName + "\n" +
                this.id() + "\n" +
                "Area: " + area + "\n" +
                "Name of the owner: " + nameOfOwner + "\n-------------------";
    }
}
