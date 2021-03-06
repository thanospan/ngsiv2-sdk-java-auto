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
public class DataProvided 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8285025104815943567L;
    private List<Entity> entities;
    private List<String> attrs;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("entities")
    public List<Entity> getEntities ( ) { 
        return this.entities;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("entities")
    public void setEntities (List<Entity> value) { 
        this.entities = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("attrs")
    public List<String> getAttrs ( ) { 
        return this.attrs;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("attrs")
    public void setAttrs (List<String> value) { 
        this.attrs = value;
    }
 
}
