package com.sebprunier.devoxxfr.jajascript;

import com.google.gson.annotations.SerializedName;

public class FlightDemand {

    @SerializedName("VOL")
    private String flightName;

    @SerializedName("DEPART")
    private Integer departureTime;

    @SerializedName("DUREE")
    private Integer flightDuration;

    @SerializedName("PRIX")
    private Integer price;

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

}
