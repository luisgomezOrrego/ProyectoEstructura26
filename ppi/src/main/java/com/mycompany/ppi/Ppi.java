
package com.mycompany.ppi;

import co.edu.tdea.edd.model.commons.Disability;
import co.edu.tdea.edd.model.commons.Ethni;
import co.edu.tdea.edd.model.geography.City;
import co.edu.tdea.edd.model.geography.Country;
import co.edu.tdea.edd.model.geography.Department;
import com.mycompany.ppi.estructure.linkedList.singly.ListSingly;


public class Ppi {

   public static void main( String[] args ) {
       load();
       menu();
       
    }

    public static ListSingly  load(){
        System.out.println("Cargando");
        ListSingly<Country> countries  = new ListSingly<>();
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
        
        countries.Show();
        ListSingly<Disability> Disabilities  = new ListSingly<>(); 

        Disabilities.add(new Disability("01","Discapacidad fisica"));
        Disabilities.add(new Disability("02", "Discapacidad visual"));
        Disabilities.add(new Disability("03", "Discapacidad auditiva"));
        Disabilities.add(new Disability("04", "Discapacidad intelectual"));
        Disabilities.add(new Disability("05", "Discapacidad psicosocial"));
        Disabilities.add(new Disability("06", "Discapacidad del desarrollo"));
        Disabilities.add(new Disability("07", "Discapacidad múltiple"));
        Disabilities.add(new Disability("08", "Discapacidad de movilidad"));
        Disabilities.add(new Disability("09", "Discapacidad de movilidad"));
        
        ListSingly<Department> Departments  = new ListSingly<>();
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
        
        
        ListSingly<City> cities  = new ListSingly<>(); 
         
        cities.add(new City("05001", "Medellín", Departments.find("02")));
        cities.add(new City("05002", "Bello", Departments.find("02")));
        cities.add(new City("05003", "Itagüí", Departments.find("02")));
        cities.add(new City("05004", "Envigado", Departments.find("02")));
        cities.add(new City("05005", "Rionegro", Departments.find("02")));
        cities.add(new City("05006", "Turbo", Departments.find("02")));
        cities.add(new City("05007", "Sabaneta", Departments.find("02")));
        cities.add(new City("05008", "La Ceja", Departments.find("02")));
        cities.add(new City("05009", "Caucasia", Departments.find("02")));
        
        ListSingly<Ethni> ethnicities  = new ListSingly<>(); 
        ethnicities.add(new Ethni("01","indigena"));
        ethnicities.add(new Ethni("02","ROM(gitanos)"));
        ethnicities.add(new Ethni("03","razial"));
        ethnicities.add(new Ethni("04","palenquero"));;
        ethnicities.add(new Ethni("05","negr@"));
        ethnicities.add(new Ethni("06","afrocolombiano"));
        ethnicities.add(new Ethni("99","ninguna"));
        
        ListSingly<ListSingly> list = new ListSingly<>(); 
        list.add(countries);
        list.add(Disabilities);
        list.add(Departments);
        list.add(cities);
        list.add(ethnicities);
        
        return list;
    }

    public static void menu(){
        System.out.println("Atender Paciente:");
        
    }

}
