package com.example.registro;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.registro.databinding.RegisterBinding;

public class Register extends AppCompatActivity {
    private RegisterBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}

