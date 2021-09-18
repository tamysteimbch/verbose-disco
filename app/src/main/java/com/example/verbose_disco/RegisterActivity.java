package com.example.verbose_disco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.verbose_disco.models.Car;
import com.example.verbose_disco.models.CarDAO;

public class RegisterActivity extends AppCompatActivity {
    EditText etCarName, etCarBrand, etManufactured, etCarColor, etEngine, etCarFuel, etValue;
    Button bSave;
    CarDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        declarations();

        bSave.setOnClickListener(v ->{

            if( etCarName.getText().toString().isEmpty() ||
                etCarBrand.getText().toString().isEmpty() ||
                etManufactured.getText().toString().isEmpty() ||
                etCarColor.getText().toString().isEmpty() ||
                etEngine.getText().toString().isEmpty() ||
                etCarFuel.getText().toString().isEmpty() ||
                etValue.getText().toString().isEmpty() ) {

                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show();

            } else {

                Car car = new Car(
                        etCarName.getText().toString(),
                        etCarBrand.getText().toString(),
                        etCarColor.getText().toString(),
                        etCarFuel.getText().toString(),
                        Integer.parseInt(etManufactured.getText().toString()),
                        Float.parseFloat(etEngine.getText().toString()),
                        etValue.getText().toString()
                );

                dao.save(car);
                Toast.makeText(this, "Registration complete!", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

    }

    private void declarations(){
        // EditText declarations
        etCarName = findViewById(R.id.etCarName);
        etEngine = findViewById(R.id.etEngine);
        etValue = findViewById(R.id.etValue);
        etCarBrand = findViewById(R.id.etCarBrand);
        etManufactured = findViewById(R.id.etManufactured);
        etCarColor = findViewById(R.id.etCarColor);
        etCarFuel = findViewById(R.id.etCarFuel);

        // Button declarations
        bSave = findViewById(R.id.bSave);

        // DAO declaration
        dao = new CarDAO();
    }
}