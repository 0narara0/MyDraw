package com.cmy.www.mydraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private SingleTouchView drawView;
    private ImageButton currentPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(new SingleTouchView(this, null));
        drawView = (SingleTouchView)findViewById(R.id.SingleTouchView);
        LinearLayout paintLayout = (LinearLayout)findViewById(R.id.llPaint);
        currentPaint = (ImageButton)paintLayout.getChildAt(0);
    }
    public void Clicked(View view){
        if(view != currentPaint){
            String  color = view.getTag().toString();
            drawView.SetColor(color);
            currentPaint = (ImageButton)view;

        }
    }
}
