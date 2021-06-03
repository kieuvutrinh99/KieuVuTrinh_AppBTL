package com.example.kieuvutrinh_appbtl.Activity.Activity_foder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kieuvutrinh_appbtl.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_startgame,btn_highscore,btn_tuto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        btn_startgame.setOnClickListener(this);
        btn_highscore.setOnClickListener(this);
        btn_tuto.setOnClickListener(this);
    }

    private void Init() {
        btn_startgame = findViewById(R.id.btn_batdau);
        btn_highscore = findViewById(R.id.btn_diemcao);
        btn_tuto = findViewById(R.id.btn_huongdan);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_batdau:{
                Intent intent = new Intent(MainActivity.this,GiaodienGame_Activity.class);
                startActivity(intent);
            }
                break;
            case R.id.btn_diemcao:{
                Intent intent2 = new Intent(MainActivity.this,DiemcaoActivity.class);
                startActivity(intent2);
            }
                break;
            case R.id.btn_huongdan:{
                Intent intent3 = new Intent(MainActivity.this,HuongDanActivity.class);
                startActivity(intent3);
            }
                break;
        }
    }
}