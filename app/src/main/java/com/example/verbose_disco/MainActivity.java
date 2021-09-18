package com.example.verbose_disco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.verbose_disco.models.CarDAO;

public class MainActivity extends AppCompatActivity {

    ListView lvCars;
    Button bRegisterNewCar;

    CarDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declarations();

        bRegisterNewCar.setOnClickListener(v -> {
            startActivity(new Intent(this, RegisterActivity.class));
        });

        lvCars.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("position", position);

            startActivity(intent);

        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        lvCars.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,
                dao.getCarList()
        ));

    }

    private void declarations(){
        // List view declarations
        lvCars = findViewById(R.id.lvCars);

        // Button declaration
        bRegisterNewCar = findViewById(R.id.bRegisterNewCar);

        // DAO declaration
        dao = new CarDAO();
    }

}