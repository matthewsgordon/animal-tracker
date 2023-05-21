/**
* AnimalTracker class
*
* @pauthor  Matthew Gordon
*
*/
public class AnimalTracker {
    public String name;                 // Name of animal.
    public CoordPoint location;         // Location of animal.
    private double distanceTravelled;   // Total distance travelled by animal.

    
    /**
    * Constructor
    *
    * Initialises AnimalTracker and variables.
    *
    */
    public AnimalTracker(String name, double x, double y)
    {
        this.name = name;
        this.location = new CoordPoint(x, y);
        this.distanceTravelled = 0;        
    }
    /**
    * moves animal 
    * 
    * @param nx distance to move in x direction
    * @param ny distance to move in y direction 
    */
    public void move(double nx, double ny)
    {
        distanceTravelled = distanceTravelled  + location.getDistance(nx, ny);
        location.setLocation(nx, ny);
    }
    /**
    * returns total distance travelled of animal 
    * 
    * @return Total distance travelled by animal.
    *
    */
    public double getDistanceTravelled() {
         return distanceTravelled;
    }
}