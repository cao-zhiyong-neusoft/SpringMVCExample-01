package com.example.servingwebcontent.form;

import lombok.Data;

@Data
public class CountryForm {


    private String mstCountryCD;

    private String mstCountryNanme;
    
    
    public CountryForm() {
    }

//    public CountryForm(String mstCountryCD,String mstCountryNanme) {
//        this.mstCountryCD = mstCountryCD;
//        this.mstCountryNanme=mstCountryNanme;
//        
//    }
}