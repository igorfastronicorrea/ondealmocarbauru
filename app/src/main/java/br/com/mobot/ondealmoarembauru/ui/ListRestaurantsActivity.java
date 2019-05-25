package br.com.mobot.ondealmoarembauru.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import br.com.mobot.ondealmoarembauru.R;

public class ListRestaurantsActivity extends AppCompatActivity {

    private RecyclerView rvRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_listrestaurants);

        rvRestaurants = findViewById(R.id.rvRestaurants);
    }
}
