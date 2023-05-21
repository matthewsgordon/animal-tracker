/**
* CoordPoint class
*
* @pauthor  Matthew Gordon
*
*/
public class CoordPoint {
    private double x;   // x location
    private double y;   // y location

    /**
    * Constructor
    *
    * Initialises CoordPoint and variables.
    *
    */
    public CoordPoint(double nx, double ny)
    {
         x = nx;
         y = ny;
        
    }

    /**
    * Constructor
    *
    * Initialises CoordPoint and variables.
    *
    */
    public CoordPoint(CoordPoint p)
    {
        x = p.x;
        y = p.y;
    }

   /**
    * sets location of animal  
    * 
    * @param nx set location to x 
    * @param ny set location to y
    */
    public void setLocation(double nx, double ny)
    {
        x = nx;
        y = ny;
    }

    /**
    * calculates the distance traveled from current location to next location 
    * 
    * @param nx distance to move in x direction
    * @param ny distance to move in y direction 
    * @return calculated distance to next location.
    */    
    public double getDistance(double nx, double ny)
    {
        return Math.sqrt(
            Math.pow(nx - x,2)
            +
            Math.pow(ny - y,2) 
        );
    }

    /**
    * returns current x value of location
    * 
    * @return x location
    */    
    public double getX()
    {
        return x;
    }

    /**
    * Returns value of y 
    * 
    * @return y location
    */
    public double getY()
    {
        return y;
    }
}
