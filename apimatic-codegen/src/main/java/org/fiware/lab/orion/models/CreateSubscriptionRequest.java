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
public class CreateSubscriptionRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6282406522263372121L;
    private String description;
    private Subject1 subject;
    private Notification1 notification;
    private String expires;
    private int throttling;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("subject")
    public Subject1 getSubject ( ) { 
        return this.subject;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("subject")
    public void setSubject (Subject1 value) { 
        this.subject = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("notification")
    public Notification1 getNotification ( ) { 
        return this.notification;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("notification")
    public void setNotification (Notification1 value) { 
        this.notification = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("expires")
    public String getExpires ( ) { 
        return this.expires;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("expires")
    public void setExpires (String value) { 
        this.expires = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("throttling")
    public int getThrottling ( ) { 
        return this.throttling;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("throttling")
    public void setThrottling (int value) { 
        this.throttling = value;
    }
 
}
