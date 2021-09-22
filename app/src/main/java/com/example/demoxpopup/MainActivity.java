package com.example.demoxpopup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.lxj.xpopup.XPopup;
import com.lxj.xpopup.interfaces.OnConfirmListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new XPopup.Builder(MainActivity.this).asConfirm("title", "content", new OnConfirmListener() {
            @Override
            public void onConfirm() {
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
}