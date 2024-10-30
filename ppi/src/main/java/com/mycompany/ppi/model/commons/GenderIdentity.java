package co.edu.tdea.edd.model.commons;

import co.edu.tdea.edd.model.ValueSetCode;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Entidad encargada de los datos asociados con los Generos
 */
public class GenderIdentity extends ValueSetCode implements Serializable {
    public static final String MALE = "1 - Hombre";
    public static final String FEMALE = "2 - Mujer";
    public static final String NON_BINARY = "3 - No binario";
    public static final String OTHER = "4 - Otro";
    
      public static String selectOption() {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Seleccione una de las siguientes opciones:");
                System.out.println(MALE);
                System.out.println(FEMALE);
                System.out.println(NON_BINARY);
                System.out.println(OTHER);
                
                String opt = sc.next();
                switch (opt) {
                    case "1":
                        return "Hombre";
                    case "2":
                        return "Mujer";
                    case "3":
                        return "No binario";
                    case "4":
                        return "Otro";
                    default:
                        System.out.println("La opción ingresada no es válida. Intente nuevamente.");
                }
            }
        }
    }
}
