
package com.mycompany.ppi;

import co.edu.tdea.edd.model.commons.BiologicalSexEnum;
import co.edu.tdea.edd.model.commons.Disability;
import co.edu.tdea.edd.model.commons.Ethni;
import static co.edu.tdea.edd.model.commons.GenderIdentity.selectOption;
import co.edu.tdea.edd.model.geography.City;
import co.edu.tdea.edd.model.geography.Country;
import co.edu.tdea.edd.model.geography.Department;
import co.edu.tdea.edd.model.user.User;
import com.mycompany.ppi.estructure.linkedList.singly.ListSingly;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Ppi {
static ListSingly<Country> countries  = new ListSingly<>();
static ListSingly<Disability> Disabilities  = new ListSingly<>();
static ListSingly<Department> Departments  = new ListSingly<>();
static ListSingly<City> cities  = new ListSingly<>(); 
static ListSingly<Ethni> ethnicities  = new ListSingly<>();

   public static void main( String[] args ) {
       load();
       menu();
    }

    public static  void load(){
        System.out.println("Cargando");
        
        countries.add(new Country("COL", "Colombia"));
        countries.add(new Country("BRA", "Brasil"));
        countries.add(new Country("CAN", "Canadá"));
        countries.add(new Country("FRA", "Francia"));
        countries.add(new Country("DEU", "Alemania"));
        countries.add(new Country("JPN", "Japón"));
        countries.add(new Country("MEX", "México"));
        countries.add(new Country("GBR", "Reino Unido"));
        countries.add(new Country("USA","Estados Unidos"));
        countries.add(new Country("ESP","España"));
        Disabilities.add(new Disability("01","Discapacidad fisica"));
        Disabilities.add(new Disability("02", "Discapacidad visual"));
        Disabilities.add(new Disability("03", "Discapacidad auditiva"));
        Disabilities.add(new Disability("04", "Discapacidad intelectual"));
        Disabilities.add(new Disability("05", "Discapacidad psicosocial"));
        Disabilities.add(new Disability("06", "Discapacidad del desarrollo"));
        Disabilities.add(new Disability("07", "Discapacidad múltiple"));
        Disabilities.add(new Disability("08", "Discapacidad de movilidad"));
        Disabilities.add(new Disability("09", "Discapacidad de movilidad"));
        
        Departments.add(new Department("01", "Amazonas", countries.find("COL")));
        Departments.add(new Department("02", "Antioquia", countries.find("COL")));
        Departments.add(new Department("03", "Arauca", countries.find("COL")));
        Departments.add(new Department("04", "Atlántico", countries.find("COL")));
        Departments.add(new Department("05", "Bolívar", countries.find("COL")));
        Departments.add(new Department("06", "Boyacá", countries.find("COL")));
        Departments.add(new Department("07", "Caldas", countries.find("COL")));
        Departments.add(new Department("08", "Caquetá", countries.find("COL")));
        Departments.add(new Department("09", "Casanare", countries.find("COL")));
        Departments.add(new Department("10", "Cauca", countries.find("COL")));
        Departments.add(new Department("11", "Cesar", countries.find("COL")));
        Departments.add(new Department("12", "Chocó", countries.find("COL")));
        Departments.add(new Department("13", "Córdoba", countries.find("COL")));
        Departments.add(new Department("14", "Guainía", countries.find("COL")));
        
        
     
         
        cities.add(new City("05001", "Medellín", Departments.find("02")));
        cities.add(new City("05002", "Bello", Departments.find("02")));
        cities.add(new City("05003", "Itagüí", Departments.find("02")));
        cities.add(new City("05004", "Envigado", Departments.find("02")));
        cities.add(new City("05005", "Rionegro", Departments.find("02")));
        cities.add(new City("05006", "Turbo", Departments.find("02")));
        cities.add(new City("05007", "Sabaneta", Departments.find("02")));
        cities.add(new City("05008", "La Ceja", Departments.find("02")));
        cities.add(new City("05009", "Caucasia", Departments.find("02")));
        
       
        ethnicities.add(new Ethni("01","indigena"));
        ethnicities.add(new Ethni("02","ROM(gitanos)"));
        ethnicities.add(new Ethni("03","razial"));
        ethnicities.add(new Ethni("04","palenquero"));
        ethnicities.add(new Ethni("05","negr@"));
        ethnicities.add(new Ethni("06","afrocolombiano"));
        ethnicities.add(new Ethni("99","ninguna"));
        
     
       
    }

    public static void menu(){
       
        ListSingly<User> Users  = new ListSingly<>(); 

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("=== Menú de Atención de Pacientes ===");
            System.out.println("1. Buscar Paciente");
            System.out.println("2. Crear Paciente");
            System.out.println("3. Crear Contacto de Salud");
            System.out.println("4. Proceso de Atención");
            System.out.println("5. Proceso de Facturación");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    
                    System.out.print("Introduce el ID del paciente: ");
                    String buscarId = scanner.nextLine();
                    if ( Users.find(buscarId)!= null) {
                        System.out.println("Paciente encontrado: " + Users.find(buscarId).getFirstName());
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;
                case 2:
                    System.out.print("Ingresa el primer nombre: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Ingresa el segundo nombre (opcional): ");
                    String middleName = scanner.nextLine();

                    System.out.print("Ingresa el apellido: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Ingresa el segundo apellido: ");
                    String surname = scanner.nextLine();
                    
                    System.out.println("digite el codigo del pais de nacionalidad ");
                    countries.Show(); 
                    Country nationality;
                    nationality=countries.find(scanner.nextLine());
                    nationality.toString();
                    
                    System.out.print("Por favor, ingresa tu fecha de cumpleaños (dd/mm/aaaa): ");
                    String fechaInput = scanner.nextLine();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate cumpleaños = LocalDate.parse(fechaInput, formatter);
                    
                    BiologicalSexEnum selectedSex = BiologicalSexEnum.selectOption();
                    
                    System.out.print("Ingrese la discapacidad ");
                    Disabilities.Show();
                    Disability disability =Disabilities.find(scanner.nextLine());
                    
                    System.out.print("Ingrese la discapacidad ");
                    ethnicities.Show();
                    Ethni ethni=ethnicities.find(scanner.nextLine());
                    
                     String selectedGender = selectOption();
                     System.out.println("Usted ha seleccionado: " + selectedGender);
                     
                    System.out.println("digite el codigo del pais de Residencia ");
                    countries.Show(); 
                    Country countryOfResidence;
                    countryOfResidence=countries.find(scanner.nextLine());
                    
                    
                    
                    break;

                case 3:
                   
                    break;
                case 4:
                  
                    break;
                case 5:
                   
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
            
            System.out.println();
        } while (option != 0);
        
        scanner.close();
    }
}
    


