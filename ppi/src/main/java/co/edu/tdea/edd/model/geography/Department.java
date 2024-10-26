package co.edu.tdea.edd.model.geography;


import co.edu.tdea.edd.model.ValueSetCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


/**
 * Entidad para los departamentos asociados a un país
 */

public class Department extends ValueSetCode implements Serializable {


    private Country country;

    public Department( String code, String description,Country country) {
        super(code, description);
        this.country = country;
    }

    public Department(Country country) {
        this.country = country;
    }

}
