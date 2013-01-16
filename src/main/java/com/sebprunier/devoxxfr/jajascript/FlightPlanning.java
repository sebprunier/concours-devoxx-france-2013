package com.sebprunier.devoxxfr.jajascript;

import java.util.ArrayList;
import java.util.List;

public class FlightPlanning {

    private Integer gain;

    private List<String> path;

    public FlightPlanning() {
        this.gain = 0;
        this.path = new ArrayList<String>();
    }
    
    public FlightPlanning(FlightPlanning fp) {
        this.gain = fp.gain;
        this.path = new ArrayList<String>();
        this.path.addAll(fp.getPath());
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
