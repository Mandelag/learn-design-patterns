
/**
 * Implementing Builder Pattern to create projected coordinate system.
 * Reason using this pattern:
 *   - Projected coordinate system have many parameter that would be 
 *   crowded if only set in constructor
 *
 * @author Keenan Mandela Gebze
 * @version 22 June 2018
 */
public class ProjectedCoordinateSystem
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
    private String geographicCoordinateSystem;
    
    /**
     * Constructor for objects of class ProjectedCoordinateSystem.
     * 
     * This class is using immutable pattern and the constructor take many parameters.
     * Parameters cannot be modified after initialization.
     * So we will use the <b>BUILDER PATTERN</b>!
     */
    public ProjectedCoordinateSystem(String name, int code, String authorityName, String authorityCode,
        double azimuth, double centralLongitude, double centralMeridian, double centralParallel,
        String coordinateUnit, double[] domain, double falseEasting,
        double falseNorthing, double height, String geographicCoordinateSystem)
    {
        super();
        this.name = name;
        this.code = code;
        this.authorityName = authorityName;
        this.authorityCode = authorityCode;
        this.azimuth = azimuth;
        this.centralLongitude = centralLongitude;
        this.centralMeridian = centralMeridian;
        this.centralParallel = centralParallel;
        this.coordinateUnit = coordinateUnit;
        this.domain = domain;
        this.falseEasting = falseEasting;
        this.falseNorthing = falseNorthing;
        this.height = height;
        this.geographicCoordinateSystem = geographicCoordinateSystem;
    }

    public String toString()
    {
        return "I'm a projected coordinate system with name: %s(%d).%n".format(this.name, this.code);
    }
}
