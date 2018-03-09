import java.util.* ;
import java.lang.*;

public class Location {
  private String name;
  private State state;
  private Country country;
  private String coords;
  private String description;

// Constructor
  public Location(String n, State s, Country c, String co, String d){
    name = n;
    state = s;
    country = c;
    coords = co;
    description = d;
  }

// Getters
  public String getName() {
    return name;
  }
  public State getState() {
    return state;
  }
  public Country getCountry() {
    return country;
  }
  public String getCoords() {
    return coords;
  }
  public String getDescription() {
    return coords;
  }

//Setter
  public void setName( String newName) {
    if((newName == null) || (newName.equals("")))    //validation
      throw new IllegalArgumentException("Name must not be blank");
    name = newName;
  }
  public void setState(State newState) {
    state = newState;
  }
  public  void setCountry(Country newCountry) {
    country = newCountry;
  }
  public void setCoords(String newCoords) {
    coords = newCoords;
  }
  public void setDescription(String newDescription) {
    description = newDescription;
  }
}

  // readFile one line at the time

  private void readFile(String inFilename) {
    FileInputStream fileStrm = null;
    InputStreamReader rdr;
    BufferedReader bufRdr;
    int lineNum;
    String line;
    try {
      fileStrm = new FileInputStream(inFilename);
      rdr = new InputStreamReader(fileStrm);
      bufRdr = new BufferedReader(rdr);
      lineNum = 0;
      line = bufRdr.readLine();
      while (line != null) {
        lineNum++;
        processLine(line);
        line = bufRdr.readLine();
      }
      fileStrm.close();
    }
    catch (IOException e) {
      if (fileStrm != null) {
        try { fileStrm.close(); } catch (IOException ex2) { }
      }
      System.out.println("Error in file processing: " + e.getMessage()); ← Or do a throw
    }
  }
