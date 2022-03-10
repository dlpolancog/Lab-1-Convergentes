package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        Spinner color = (Spinner)findViewById(R.id.color);
        String selectedBeerType = String.valueOf(color.getSelectedItem());

        List<String> BrandList = expert.getBrands(selectedBeerType);
        StringBuilder brandsFormatted = new StringBuilder(); // var para concatenar
        for (String brand : BrandList){
            brandsFormatted.append(brand).append('\n'); //Metodo para concatenar strings de manera mas eficiente
        }

        TextView brand = (TextView)findViewById(R.id.brands);
        brand.setText(brandsFormatted);
    }



}