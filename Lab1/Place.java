public abstract class Place {
  private String name;
  private String shortName;
  private int area;
  private int population;
  private String popRef;

  // Getters
    public String getName() {
      return name;
    }
    public String getShortName() {
      return shortName;
    }
    public int getArea() {
      return area;
    }
    public int getPopulation() {
      return population;
    }
    public String getPopRef() {
      return popRef;
    }

  //Setter
    public void setName( String newName) {
      if((newName == null) || (newName.equals("")))    //validation
        throw new IllegalArgumentException("Name must not be blank");
      name = newName;
    }
    public void setShortName(String newShortName) {
      shortName = newShortName;
    }
    public  void setCountry(int newArea) {
      area = newArea;
    }
    public void setPopulation(int newPopulation) {
      population = newPopulation;
    }
    public void setPopRef(String newPopRef) {
      popRef = newPopRef;
    }

}
