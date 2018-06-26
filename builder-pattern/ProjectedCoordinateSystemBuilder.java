
/**
 * Implementing Builder Pattern to create projected coordinate system.
 * Reason using this pattern:
 *   - Projected coordinate system have many parameter that would be 
 *   crowded if only set in constructor
 *
 * @author Keenan Mandela Gebze
 * @version 22 June 2018
 */
public class ProjectedCoordinateSystemBuilder
{
    private String name;
    private int code;
    private String authorityName;
    private String authorityCode;
    private double azimuth;
    private double centralLongitude;
    private double centralMeridian;
    private double centralParallel;
    private String coordinateUnit;
    private double[] domain;
    private int factoryCode;
    private double falseEasting;
    private double falseNorthing;
    private double height;
    
    /**
     * Constructor for objects of class ProjectedCoordinateSystemBuilder
     */
    public ProjectedCoordinateSystemBuilder()
    {
        
    }

    public ProjectedCoordinateSystem build()
    {
        return new ProjectedCoordinateSystem();
    }
}
