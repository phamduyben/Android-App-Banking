package com.example.demoapp.Activities.ThanhToanHoaDon;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import com.example.demoapp.Activities.MainActivity;
import com.example.demoapp.R;

public class DangKySuDungTheTaiPOSATMNuocNgoai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_su_dung_the_tai_posatmnuoc_ngoai);
        Toolbar toolbar = findViewById(R.id.tool_bar_dk_posatm_nuoc_ngoai);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        // Lấy hình ảnh icon trở lại từ ImageView
        ImageView backButton = findViewById(R.id.toolbar_back_dk_posatm_nuoc_ngoai);
        Drawable drawable = backButton.getDrawable();

        // Thiết lập màu sắc cho icon
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable);
            DrawableCompat.setTint(
                    drawable,
                    ContextCompat.getColor(this, R.color.white)
            ); // Thay đổi your_color thành màu sắc bạn muốn
        }

        // Đặt hình ảnh đã được thiết lập màu sắc làm biểu tượng trở lại trên ImageView
        backButton.setImageDrawable(drawable);

        // Bắt sự kiện click của ImageView
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        DangKySuDungTheTaiPOSATMNuocNgoai.this,
                        MainActivity.class
                ));
            }
        });
    }
}