package com.example.verbose_disco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.verbose_disco.models.Car;
import com.example.verbose_disco.models.CarDAO;

import java.text.NumberFormat;
import java.util.Locale;

public class DetailsActivity extends AppCompatActivity {

    TextView tvCarName, tvCarBrand, tvManufactured, tvColor, tvEngine, tvFuel, tvValue;
    Button bBack;
    CarDAO dao;
    NumberFormat numberFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        declarations();
        dao = new CarDAO();
        numberFormat = NumberFormat.getInstance(new Locale("pt", "BR"));
        Intent intent = getIntent();

        int position = intent.getIntExtra("position", -1);
        if (position == -1) { finish(); }

        Car car = dao.getCar(position);

        tvCarName.setText("Car Name: " + car.getCarName());
        tvCarBrand.setText("Brand: " + car.getCarBrand());
        tvManufactured.setText("Year of manufacture: " + car.getManufactured());
        tvColor.setText("Color: " + car.getCarColor());
        tvEngine.setText("Engine: " + car.getEngine());
        tvFuel.setText("Fuel: " + car.getCarFuel());
        tvValue.setText("Market Value: " + car.getCarValue());

        bBack.setOnClickListener(v -> {
            finish();
        });

    }

    private void declarations() {
        // Text view declarations
        tvCarName = findViewById(R.id.tvCarName);
        tvCarBrand = findViewById(R.id.tvCarBrand);
        tvColor = findViewById(R.id.tvColor);
        tvManufactured = findViewById(R.id.tvManufactured);
        tvEngine = findViewById(R.id.tvEngine);
        tvFuel = findViewById(R.id.tvFuel);
        tvValue = findViewById(R.id.tvValue);

        // Button declaration
        bBack = findViewById(R.id.bBack);
    }
}