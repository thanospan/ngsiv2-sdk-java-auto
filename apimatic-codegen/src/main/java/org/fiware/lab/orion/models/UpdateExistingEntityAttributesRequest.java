/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class UpdateExistingEntityAttributesRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1779394323501285357L;
    private Temperature1 temperature;
    private SeatNumber seatNumber;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("temperature")
    public Temperature1 getTemperature ( ) { 
        return this.temperature;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("temperature")
    public void setTemperature (Temperature1 value) { 
        this.temperature = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("seatNumber")
    public SeatNumber getSeatNumber ( ) { 
        return this.seatNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("seatNumber")
    public void setSeatNumber (SeatNumber value) { 
        this.seatNumber = value;
    }
 
}
