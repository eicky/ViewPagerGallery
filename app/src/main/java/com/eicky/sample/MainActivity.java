package com.eicky.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private com.eicky.ViewPagerGallery gallery;
    private android.widget.RelativeLayout activitymain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.activitymain = (RelativeLayout) findViewById(R.id.activity_main);
        this.gallery = (com.eicky.ViewPagerGallery) findViewById(R.id.gallery);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 9; i++){
            int id = getResources().getIdentifier("img" + i, "mipmap", getPackageName());
            list.add(id);
        }
        gallery.setImgResources(list);
    }
}
