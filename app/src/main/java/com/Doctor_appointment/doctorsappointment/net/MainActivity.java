package com.Doctor_appointment.doctorsappointment.net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Doctor_appointment.doctorsappointment.net.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        getSupportActionBar().hide();
        setContentView(binding.getRoot());

    }
}