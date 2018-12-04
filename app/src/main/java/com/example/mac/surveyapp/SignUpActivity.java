package com.example.mac.surveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import static com.example.mac.surveyapp.CountryApi.BASE_URL;

public class SignUpActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText phoneEditText;
    EditText emailEditText;
    Spinner genderSpinner ;
    Spinner countrySpinner;
    Spinner provienceSpinner;
    Button takeSurveyButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        genderSpinner= (Spinner)findViewById(R.id.genderSpinner);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(this,R.array.numbers,android.R.layout.simple_list_item_1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(arrayAdapter);
        CountryApi countryApi = retrofit.create(CountryApi.class);
        Call<List<CountryResponse>> countryResponseCall =countryApi.getCountries();
        countryResponseCall.enqueue(new Callback<List<CountryResponse>>() {
            @Override
            public void onResponse(Call<List<CountryResponse>> call, Response<List<CountryResponse>> response) {

                countrySpinner=(Spinner)findViewById(R.id.counrtySpinner);
                countrySpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(),Integer.toString(position+1),Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onFailure(Call<List<CountryResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
