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
public class UpdateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -141060920166766654L;
    private String actionType;
    private List<Entity5> entities;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("actionType")
    public String getActionType ( ) { 
        return this.actionType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("actionType")
    public void setActionType (String value) { 
        this.actionType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("entities")
    public List<Entity5> getEntities ( ) { 
        return this.entities;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("entities")
    public void setEntities (List<Entity5> value) { 
        this.entities = value;
    }
 
}
