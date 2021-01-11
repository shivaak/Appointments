package com.shiva.appointments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shiva.appointments.adapter.AppointmentAdapter;
import com.shiva.appointments.model.AppointmentModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    List<AppointmentModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        for(int i=1;i<=20;i++){
            data.add(new AppointmentModel("Type"+i, "This is my description "+i, new Date()));
        }

        rv = (RecyclerView)findViewById(R.id.rclAptView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new AppointmentAdapter(getApplicationContext(), data));
    }
}