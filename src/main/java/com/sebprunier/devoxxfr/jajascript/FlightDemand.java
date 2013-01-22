package com.sebprunier.devoxxfr.jajascript;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightDemand {

    @Expose
    @SerializedName("VOL")
    private String flightName;

    @Expose
    @SerializedName("DEPART")
    private Integer departureTime;

    @Expose
    @SerializedName("DUREE")
    private Integer flightDuration;

    @Expose
    @SerializedName("PRIX")
    private Integer price;

    private FlightDemand bestNextFlightDemand;

    private Integer gainForBestNextFlightDemand = 0;

    public FlightDemand() {
        super();
    }

    public FlightDemand(String flightName, Integer departureTime, Integer flightDuration, Integer price) {
        super();
        this.flightName = flightName;
        this.departureTime = departureTime;
        this.flightDuration = flightDuration;
        this.price = price;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Integer getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Integer departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Integer flightDuration) {
        this.flightDuration = flightDuration;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public FlightDemand getBestNextFlightDemand() {
        return bestNextFlightDemand;
    }

    public void setBestNextFlightDemand(FlightDemand bestNextFlightDemand) {
        this.bestNextFlightDemand = bestNextFlightDemand;
    }

    public Integer getGainForBestNextFlightDemand() {
        return gainForBestNextFlightDemand;
    }

    public void setGainForBestNextFlightDemand(Integer gainForBestNextFlightDemand) {
        this.gainForBestNextFlightDemand = gainForBestNextFlightDemand;
    }

}
