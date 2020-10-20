package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private static Company companyInstance = null;
    private String name="MG";
    private List<Magasin> listOfMagazin=new ArrayList<>();
    private Company() { };
    public static Company getInstance( ) throws Exception {
        if(companyInstance==null){
            companyInstance=new Company();
            return companyInstance;

        }

        else  {
            System.out.println("you should have only one company");
            companyInstance=null;
        }
        return  companyInstance;
    }

    public void buildMagasin(String address){
        listOfMagazin.add(new Magasin(address));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Magasin> getListOfMagazin() {
        return listOfMagazin;
    }

    public void setListOfMagazin(List<Magasin> listOfMagazin) {
        this.listOfMagazin = listOfMagazin;
    }
}
