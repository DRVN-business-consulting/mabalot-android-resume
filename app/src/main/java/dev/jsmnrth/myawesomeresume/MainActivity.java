package dev.jsmnrth.myawesomeresume;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2;
    EditText editText;
    CheckBox timelineCheckbox, techstackCheckbox, introductionCheckbox;
    LinearLayout timelineDetailsLayout, techstackLayout, introductionLayout;
    Boolean isChecked;
    SeekBar htmlSeekbar, javaSeekbar, sqlSeekbar, postmanSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        introductionCheckbox = findViewById(R.id.introductionCheckbox);
        introductionLayout = findViewById(R.id.introductionLayout);
        timelineDetailsLayout = findViewById(R.id.timelineDetailsLayout);
        timelineCheckbox = findViewById(R.id.timelineCheckbox);
        techstackCheckbox = findViewById(R.id.techstackCheckbox);
        techstackLayout = findViewById(R.id.techStackLayout);
        htmlSeekbar = findViewById(R.id.htmlSeekBar);
        javaSeekbar = findViewById(R.id.javaSeekBar);
        sqlSeekbar = findViewById(R.id.sqlSeekBar);
        postmanSeekbar = findViewById(R.id.postmanSeekBar);

        introductionCheckbox.setOnCheckedChangeListener((introductionCheckbox, isChecked) -> {
            if(isChecked){
                introductionLayout.setVisibility(View.VISIBLE);
            } else {
                introductionLayout.setVisibility(View.GONE);
            }
        });

        timelineCheckbox.setOnCheckedChangeListener((timelineCheckbox, isChecked) -> {
            if(isChecked){
                timelineDetailsLayout.setVisibility(View.VISIBLE);
            } else {
                timelineDetailsLayout.setVisibility(View.GONE);
            }
        });

        techstackCheckbox.setOnCheckedChangeListener((techstackCheckbox,isChecked) -> {
            if(isChecked){
                techstackLayout.setVisibility(View.VISIBLE);
            } else {
                techstackLayout.setVisibility(View.GONE);
            }
        });

        htmlSeekbar.setOnTouchListener((v, event) -> true);
        javaSeekbar.setOnTouchListener((v, event) -> true);
        sqlSeekbar.setOnTouchListener((v, event) -> true);
        postmanSeekbar.setOnTouchListener((v, event) -> true);

    }

    public void onToggleClick(View view) {
        boolean isVisible = textView2.getVisibility() == View.VISIBLE;
        textView2.setVisibility(isVisible ? View.GONE : View.VISIBLE);
        ColorStateList x = ColorStateList.valueOf(Color.parseColor("#ff0000"));
        editText.setBackgroundTintList(x);
    }
}