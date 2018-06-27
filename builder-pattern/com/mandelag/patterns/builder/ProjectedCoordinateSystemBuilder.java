package com.mandelag.patterns.builder;
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
    private double falseEasting;
    private double falseNorthing;
    private double height;
    private String geographicCoordinateSystem;
    
    /**
     * Constructor for objects of class ProjectedCoordinateSystemBuilder
     */
    public ProjectedCoordinateSystemBuilder()
    {
        super();
    }
    
    public ProjectedCoordinateSystemBuilder withName(String name) 
    {
        this.name = name;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withCode(int code) 
    {
        this.code = code;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withAuthorityName(String authorityName) 
    {
        this.authorityName = authorityName;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withAuthorityCode(String authorityCode) 
    {
        this.authorityCode = authorityCode;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withAzimuth(double azimuth) 
    {
        this.azimuth = azimuth;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withCentralLongitude(double centralLongitude) 
    {
        this.centralLongitude = centralLongitude;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withCentralParallel(double centralParallel) 
    {
        this.centralParallel = centralParallel;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withCentralMeridian(double centralMeridian) 
    {
        this.centralMeridian = centralMeridian;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withCoordinateUnit(String coordinateUnit) 
    {
        this.coordinateUnit = coordinateUnit;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withDomain(double[] domain) 
    {
        this.domain = domain;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withFalseEasting(double falseEasting) 
    {
        this.falseEasting = falseEasting;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withFalseNorthing(double falseNorthing) 
    {
        this.falseNorthing = falseNorthing;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withHeight(double height) 
    {
        this.height = height;
        return this;
    }
    
    public ProjectedCoordinateSystemBuilder withGeographicCoordinateSystem(String geographicCoordinateSystem) 
    {
        this.geographicCoordinateSystem = geographicCoordinateSystem;
        return this;
    }
    
    public ProjectedCoordinateSystem build()
    {
        return new ProjectedCoordinateSystem(this.name, this.code, this.authorityName, this.authorityCode,
        this.azimuth, this.centralLongitude, this.centralMeridian, this.centralParallel,
        this.coordinateUnit, this.domain, this.falseEasting,
        this.falseNorthing, this.height, this.geographicCoordinateSystem);
    }
}
