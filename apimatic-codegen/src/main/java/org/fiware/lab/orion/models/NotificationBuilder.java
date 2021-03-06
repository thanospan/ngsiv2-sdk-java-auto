/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class NotificationBuilder {
    //the instance to build
    private Notification notification;

    /**
     * Default constructor to initialize the instance
     */
    public NotificationBuilder() {
        notification = new Notification();
    }

    public NotificationBuilder httpCustom(HttpCustom httpCustom) {
        notification.setHttpCustom(httpCustom);
        return this;
    }

    public NotificationBuilder attrsFormat(String attrsFormat) {
        notification.setAttrsFormat(attrsFormat);
        return this;
    }

    public NotificationBuilder attrs(List<String> attrs) {
        notification.setAttrs(attrs);
        return this;
    }

    public NotificationBuilder timesSent(int timesSent) {
        notification.setTimesSent(timesSent);
        return this;
    }

    public NotificationBuilder lastNotification(String lastNotification) {
        notification.setLastNotification(lastNotification);
        return this;
    }

    public NotificationBuilder lastFailure(String lastFailure) {
        notification.setLastFailure(lastFailure);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Notification build() {
        return notification;
    }
}