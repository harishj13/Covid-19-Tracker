package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry,tvCases1,tvRecovered1,tvCritical1,tvActive1,tvTodayCases1,tvTotalDeaths1,tvTodayDeaths1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+ AffectedCountries.countryModelList.get(positionCountry).getCountryName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountry = findViewById(R.id.tvCountry);
        tvCases1 = findViewById(R.id.tvCases1);
        tvRecovered1 = findViewById(R.id.tvRecovered1);
        tvCritical1 = findViewById(R.id.tvCritical1);
        tvActive1 = findViewById(R.id.tvActive1);
        tvTodayCases1 = findViewById(R.id.tvTodayCases1);
        tvTotalDeaths1 = findViewById(R.id.tvTotalDeaths1);
        tvTodayDeaths1 = findViewById(R.id.tvTodayDeath1);


        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountryName());
        tvCases1.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvRecovered1.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical1.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
        tvActive1.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvTodayCases1.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTotalDeaths1.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvTodayDeaths1.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayDeaths());







    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() ==  android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}