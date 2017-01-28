package com.techpalle.multifunctionsuseproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerNameSalute, spinnerCountry, spinneState, spinnerCity;
    ArrayAdapter adapterNameSalute, adapterCountry,adapterState, adapterCity;
    String[] arrayNameSalute = {"Mr.", "Miss", "Mrs."};
    CountryCodes country;
    TreeMap<String, CountryCodes> mapCountry;
    ArrayList al;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerNameSalute = (Spinner) findViewById(R.id.spinner_name_salute);
        spinnerCountry = (Spinner) findViewById(R.id.spinner_country);
        spinneState = (Spinner) findViewById(R.id.spinner_state);
        spinnerCity = (Spinner) findViewById(R.id.spinner_city);

        adapterNameSalute = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayNameSalute);
        spinnerNameSalute.setAdapter(adapterNameSalute);
        adapterNameSalute.notifyDataSetChanged();
        CountryCodes countryIndia1 = new CountryCodes("+91", "Madhya Pradesh");
        CountryCodes countryIndia2 = new CountryCodes("+91", "Uttar Pradesh");
        CountryCodes countryIndia3 = new CountryCodes("+91", "Himachal Pradesh");
        CountryCodes countryIndia4 = new CountryCodes("+91", "Andhra Pradesh");
        mapCountry.put("India",countryIndia1);
        mapCountry.put("India",countryIndia2);
        mapCountry.put("India",countryIndia3);
        mapCountry.put("India",countryIndia4);

    }
}
