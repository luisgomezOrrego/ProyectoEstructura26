package co.edu.tdea.edd.model.geography;


import co.edu.tdea.edd.model.ValueSetCode;

import java.io.Serializable;

/**
 * Entidad para los países
 */
public class Country extends ValueSetCode implements Serializable {

    @Override
    public String toString() {
        return getCode() + " - " + getDescription();
    }
    
     public Country(String code, String description) {
   
      
        setCode(code);
        setDescription(description);
    }

    
}
