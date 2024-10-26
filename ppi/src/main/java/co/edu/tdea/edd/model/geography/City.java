package co.edu.tdea.edd.model.geography;


import co.edu.tdea.edd.model.ValueSetCode;

import java.io.Serializable;


/**
 * Entidad para las ciudades asociadas a un departamento
 */


public class City extends ValueSetCode implements Serializable {
    private Department department;

    public City( String code, String description,Department department) {
        super(code, description);
        this.department = department;
    }

    public City(Department department) {
        this.department = department;
    }

    
    
}
