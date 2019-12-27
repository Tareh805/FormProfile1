package com.example.a1718033_tareh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a1718033_tareh.helper.LocaleHelper;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {
//
//    TextView textView2, textView4, textView6, txt_caption, txt_hobi;
//    Button button;
//
//    @Override
//    protected void attachBaseContext(Context newBase) {
//        super.attachBaseContext(LocaleHelper.onAttach(newBase, "en"));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textView2 = (TextView)findViewById(R.id.textView2);
//        textView4 = (TextView)findViewById(R.id.textView4);
//        textView6 = (TextView)findViewById(R.id.textView6);
//        txt_caption = (TextView) findViewById(R.id.txt_caption);
//        txt_hobi = (TextView) findViewById(R.id.txt_hobi);
//        button = (Button) findViewById(R.id.button);
//
//        Paper.init(this);
//
//        String language = Paper.book().read("language");
//        if (language == null)
//            Paper.book().write("language","en");
//
//        updateView((String)Paper.book().read("language"));
//
//
//    }
//
//    private void updateView(String lang) {
//        Context context = LocaleHelper.setLocale(this, lang);
//        Resources resources = context.getResources();
//
//        textView2.setText(resources.getString(R.string.hello));
    }

    public void travel (View view)
    {
        Intent t = new Intent(MainActivity.this, profile.class);
        startActivity(t);
    }
}
