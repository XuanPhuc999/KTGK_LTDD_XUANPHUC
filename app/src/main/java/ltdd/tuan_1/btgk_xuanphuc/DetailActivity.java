package ltdd.tuan_1.btgk_xuanphuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ltdd.tuan_1.btgk_xuanphuc.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        String name = intent.getStringExtra("name");

        String exp = intent.getStringExtra("exp");

        int image = intent.getIntExtra("image", 1);

        binding.experience.setText(exp);
        binding.imageDetailLanguage.setImageResource(image);
        binding.namelanguage.setText(name);


    }
}