package com.aastha.drivingapp.model;

public class Alert {
    private int alertId;

    private String timestamp;

    private boolean isOverSpeeding;

    private String vehicleId;

    /*
    locationType can have only below values
        highway,
        residential,
        commercial,
        city_center
    */
    private String locationType;

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAlertId() {
        return alertId;
    }

    public void setAlertId(int alertId) {
        this.alertId = alertId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isOverSpeeding() {
        return isOverSpeeding;
    }

    public void setOverSpeeding(boolean overSpeeding) {
        isOverSpeeding = overSpeeding;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
}
