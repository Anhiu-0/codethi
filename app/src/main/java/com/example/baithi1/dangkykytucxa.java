package com.example.baithi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class dangkykytucxa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dangkykytucxa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ánh xạ
        Button choose = findViewById(R.id.choose);
        Button exit = findViewById(R.id.exit);
        Button next = findViewById(R.id.next);
        //sử lý sự kiện
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(dangkykytucxa.this);
                builder.setTitle("chọn loại phòng ngủ và dịch vụ").setMessage("");

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),dangkykytucxa.class);
                startActivity(intent);
                Intent intent1 = new Intent(Intent.ACTION_MAIN);
                intent1.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent1);
                finish();
            }
        });
    }
}