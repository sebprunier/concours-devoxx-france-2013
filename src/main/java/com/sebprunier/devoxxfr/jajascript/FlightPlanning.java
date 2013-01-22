package com.sebprunier.devoxxfr.jajascript;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class FlightPlanning {

    @Expose
    private Integer gain;

    @Expose
    private List<String> path;

    public FlightPlanning() {
        this.gain = 0;
        this.path = new ArrayList<String>();
    }
    
    public Integer getGain() {
        return gain;
    }

    public void setGain(Integer gain) {
        this.gain = gain;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

}
