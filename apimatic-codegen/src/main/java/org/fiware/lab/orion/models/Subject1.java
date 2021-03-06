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
public class Subject1 
        implements java.io.Serializable {
    private static final long serialVersionUID = 1799616300101865407L;
    private List<Entity1> entities;
    private Condition condition;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("entities")
    public List<Entity1> getEntities ( ) { 
        return this.entities;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("entities")
    public void setEntities (List<Entity1> value) { 
        this.entities = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("condition")
    public Condition getCondition ( ) { 
        return this.condition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("condition")
    public void setCondition (Condition value) { 
        this.condition = value;
    }
 
}
