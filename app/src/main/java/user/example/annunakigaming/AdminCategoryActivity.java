package user.example.annunakigaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static user.example.annunakigaming.R.layout.activity_admin_category;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView playstation_4, ms_xbox_1, playstation_5;
    private ImageView ms_xbox_360, playstation_3, mobile_gaming;
    private ImageView nintendo_switch, playstation_vita;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_admin_category);


        playstation_4 = (ImageView) findViewById(R.id.playstation_4);
        ms_xbox_1 = (ImageView) findViewById(R.id.ms_xbox_1);
        playstation_5 = (ImageView) findViewById(R.id.playstation_5);

        ms_xbox_360 = (ImageView) findViewById(R.id.ms_xbox_360);
        playstation_3 = (ImageView) findViewById(R.id.playstation_3);
        mobile_gaming = (ImageView) findViewById(R.id.mobile_gaming);

        nintendo_switch = (ImageView) findViewById(R.id.nintendo_switch);
        playstation_vita = (ImageView) findViewById(R.id.playstation_vita);


        playstation_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "playstation_4");
                startActivity(intent);
            }
        });

        ms_xbox_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", " ms_xbox_1");
                startActivity(intent);
            }
        });

        playstation_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "playstation_5");
                startActivity(intent);
            }
        });

        ms_xbox_360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "ms_xbox_360");
                startActivity(intent);
            }
        });

        playstation_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "playstation_3");
                startActivity(intent);
            }
        });

        mobile_gaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "mobile_gaming");
                startActivity(intent);
            }
        });

        nintendo_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", " nintendo_switch");
                startActivity(intent);
            }
        });

        playstation_vita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "playstation_vita");
                startActivity(intent);
            }
        });
    }
}