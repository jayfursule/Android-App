package com.beercompany.beeradviser;

import java.util.ArrayList;

import java.util.List;



/**

 * Created by Jay Fursule 29/03/19

 */



public class BeerExpert {

    List<String> getBrands(String color) {

        List<String> brands = new ArrayList<>();

        if (color.equals("amber")) {

            brands.add("Jack Amber");

            brands.add("Red Moose");

        } else if(color.equals("dark")) {

            brands.add("Jail Pale Ale");

            brands.add("Gout Stout");

        }else if(color.equals("light"))
        {
            brands.add("light Red");
            brands.add("Light jack amber");
        }else{
            brands.add("Sorry Not available please try anonther");
        }

        return brands;

    }

}