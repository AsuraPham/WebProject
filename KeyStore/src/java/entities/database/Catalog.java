package entities.database;
// Generated Oct 21, 2017 10:21:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Catalog generated by hbm2java
 */
public class Catalog  implements java.io.Serializable {


     private Integer catalogId;
     private String catalogName;
     private Set types = new HashSet(0);

    public Catalog() {
    }

    public Catalog(String catalogName, Set types) {
       this.catalogName = catalogName;
       this.types = types;
    }
   
    public Integer getCatalogId() {
        return this.catalogId;
    }
    
    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }
    public String getCatalogName() {
        return this.catalogName;
    }
    
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
    public Set getTypes() {
        return this.types;
    }
    
    public void setTypes(Set types) {
        this.types = types;
    }




}


