import java.util.* ;

public class State extends Place{
  private Country country;
  private String areaUnit;

  // getters
  public Country getCountry() {
    return country;
  }
  public String getAreaUnit() {
    return areaUnit;
  }

  //Setters
  public void setCountry(Country newCountry) {
    country = newCountry;
  }
  public void setAreaUnit(String newAreaUnit) {
    areaUnit = newAreaUnit;
  }
}
