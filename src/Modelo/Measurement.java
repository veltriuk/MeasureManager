package Modelo;
// Generated May 28, 2017 8:18:43 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Measurement generated by hbm2java
 */
public class Measurement  implements java.io.Serializable {


     private Integer id;
     private Meter meter;
     private Date time;
     private int phase;
     private Set measures = new HashSet(0);

    public Measurement() {
    }

	
    public Measurement(Meter meter, Date time, int phase) {
        this.meter = meter;
        this.time = time;
        this.phase = phase;
    }
    public Measurement(Meter meter, Date time, int phase, Set measures) {
       this.meter = meter;
       this.time = time;
       this.phase = phase;
       this.measures = measures;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Meter getMeter() {
        return this.meter;
    }
    
    public void setMeter(Meter meter) {
        this.meter = meter;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public int getPhase() {
        return this.phase;
    }
    
    public void setPhase(int phase) {
        this.phase = phase;
    }
    public Set getMeasures() {
        return this.measures;
    }
    
    public void setMeasures(Set measures) {
        this.measures = measures;
    }




}


