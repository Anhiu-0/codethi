package com.example.baithi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Loginform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginform);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ánh xạ
        EditText txtusename = findViewById(R.id.txtusename);
        EditText txtpassword = findViewById(R.id.txtpassword);
        Button exit = findViewById(R.id.exit);
        Button login = findViewById(R.id.login);
        //xử lý xự kiện thoát ứng dụng
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //khởi tạo lại activity_loginform
                Intent intent = new Intent(getApplicationContext(),Loginform.class);
                startActivity(intent);
                //tạo sự kiện kết thúc và thoát ứng dụng
                Intent intent1 = new Intent(Intent.ACTION_MAIN);
                intent1.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent1);
                finish();


            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkusername = txtusename.getText().toString();
                String checkpassword = txtpassword.getText().toString();
                if(checkusername.isEmpty() || checkpassword.isEmpty())
                {
                    Toast.makeText(Loginform.this, "vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else if(checkusername.equals("cnttk14hn") && checkpassword.equals("cnttk14"))
                {
                    Toast.makeText(Loginform.this,"đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Loginform.this, dangkykytucxa.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Loginform.this,"không thể đăng nhập",Toast.LENGTH_SHORT).show();
                    txtpassword.setText(" ");
                }
            }
        });
    }
}