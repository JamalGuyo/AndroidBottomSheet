package com.example.root.a201bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout bottomsheetLayout;
    BottomSheetBehavior bottomSheetBehavior;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetLayout = findViewById(R.id.bottomsheet);
        imageView = findViewById(R.id.shareimg);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetLayout);
        //STATE HIDDEN --> HIDES EVERYTHING
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        //STATE HIDES BOTTOM SHEET BUT SHOW THE TITLE
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        //STATE EXPANDED --> SHOWS THE BOTTOM SHEET BY DEFAULT
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}
