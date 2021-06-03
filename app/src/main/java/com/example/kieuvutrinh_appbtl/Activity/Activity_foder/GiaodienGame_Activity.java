package com.example.kieuvutrinh_appbtl.Activity.Activity_foder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.kieuvutrinh_appbtl.Activity.Database;
import com.example.kieuvutrinh_appbtl.Activity.model.Category;
import com.example.kieuvutrinh_appbtl.R;

import java.util.ArrayList;
import java.util.List;

public class GiaodienGame_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewHightScore;
    private Button btn_Vanhoa,btn_Lichsu,btnDichbenh;
    private static final int REQUEST_CODE_QUESTION = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaodien_game_);
        Init();
        loadCategories();
        btn_Vanhoa.setOnClickListener(this);
        btn_Lichsu.setOnClickListener(this);
        btnDichbenh.setOnClickListener(this);
    }

    private void Init() {
        btn_Vanhoa = findViewById(R.id.btn_vanhoa);
        btn_Lichsu = findViewById(R.id.btn_lichsu);
        btnDichbenh = findViewById(R.id.btn_dichbenh);
        textViewHightScore = findViewById(R.id.tv_hightscore);
    }

    private void loadCategories(){
        Database database = new Database(this);
        List<Category> categories = database.getDataCategories();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_lichsu:{
                startQuestion();
            }
                break;
            case R.id.btn_vanhoa:{
                startQuestion();
            }
                break;
            case R.id.btn_dichbenh:{
                startQuestion();
            }
                break;
        }
    }

    private void startQuestion() {
        Category category = new Category();
        int categoryID = category.getId();
        String categoryName = category.getName();

        Intent i = new Intent(GiaodienGame_Activity.this,QuestionActivity.class);
        i.putExtra("idcategories",categoryID);
        i.putExtra("categoriesName",categoryName);
        startActivityForResult(i,REQUEST_CODE_QUESTION);
    }
}