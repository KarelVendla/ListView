package com.example.opilane.listview;

import java.util.ArrayList;
import java.util.List;

public class Zipcodes {
    //New list
    private final List<Zipcode> list = new ArrayList<>();

    private static final String[][] codes = {

            {"10115", "Berlin-Mitte"},
            {"15512", "Paide"},
            {"10125", "Narva"},
            {"10125", "Keila"},
    };

    public Zipcodes() {
        for (String[] code : codes) list.add(new Zipcode(code[0], code[1]));
    }

    //Create search() method for finding ZipCodes
    public List<Zipcode> search(String code, String city) {
        city = city.toLowerCase();
        List<Zipcode> lines = new ArrayList();
        for (Zipcode z : list)
            if (z.getCode().startsWith(code) && z.getCity().toLowerCase().contains(city))
                lines.add(z);
            return lines;

    }
}

