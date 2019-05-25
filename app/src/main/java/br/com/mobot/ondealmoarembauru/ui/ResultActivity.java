package br.com.mobot.ondealmoarembauru.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import br.com.mobot.ondealmoarembauru.R;

public class ResultActivity extends AppCompatActivity {

    private TextView txtResult;
    private RecyclerView rvVotesResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_result);

        txtResult = findViewById(R.id.txtResult);
        rvVotesResults = findViewById(R.id.rvVotesResults);

    }
}
