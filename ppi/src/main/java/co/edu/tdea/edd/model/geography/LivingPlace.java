package co.edu.tdea.edd.model.geography;


import co.edu.tdea.edd.model.ValueSetCode;

import java.io.Serializable;

/**
 * Entidad para encargada de los datos relacionados con las Zonas de Residencia.
 */
public class LivingPlace extends ValueSetCode implements Serializable {
    private City city;
    private String barrio;
    private String address;
    private String category;

    public LivingPlace(City city, String barrio, String address, String category) {
        this.city = city;
        this.barrio = barrio;
        this.address = address;
        this.category = category;
    }
    
    
}
