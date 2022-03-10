package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands (String color){

        List<String> brands = new ArrayList<String>();

        if (color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else{
            if(color.equals("Light")){
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
            }else{
                if(color.equals("Brown")){
                    brands.add("Bruder");
                    brands.add("Dude Kaffe");
                }else{
                    if(color.equals("Dark")){
                        brands.add("Guinness");
                        brands.add("Karl Grandin");
                    }
                }
            }

        }
        return brands;
    }

}
