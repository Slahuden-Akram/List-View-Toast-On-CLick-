package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnCreate);
        String[] data = {"ListView","ListView","ListView","ListView","ListView","ListView","ListView",
                "ListView","ListView","ListView","ListView","ListView","ListView","ListView",
                "ListView","ListView","ListView","ListView","ListView","ListView","ListView",
                "ListView","ListView","ListView","ListView","ListView","ListView","ListView",
                "ListView","ListView","ListView","ListView","ListView","ListView","ListView",};

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1, data);

                ListView ls = (ListView) findViewById(R.id.listView);
                ls.setAdapter(adapter);

                ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(getApplicationContext(), i+": Selected Item : "+data[i], Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }
}