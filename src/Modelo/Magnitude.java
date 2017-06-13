package Modelo;
// Generated Jun 11, 2017 11:33:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Magnitude generated by hbm2java
 */
public class Magnitude  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String symbol;
     private String unit;
     private String unitSymbol;
     private Set quantities = new HashSet(0);

    public Magnitude() {
    }

	
    public Magnitude(String name) {
        this.name = name;
    }
    public Magnitude(String name, String symbol, String unit, String unitSymbol, Set quantities) {
       this.name = name;
       this.symbol = symbol;
       this.unit = unit;
       this.unitSymbol = unitSymbol;
       this.quantities = quantities;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnitSymbol() {
        return this.unitSymbol;
    }
    
    public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }
    public Set getQuantities() {
        return this.quantities;
    }
    
    public void setQuantities(Set quantities) {
        this.quantities = quantities;
    }




}

