package com.jackey.butterknife;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindArray;
import butterknife.BindBitmap;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends Activity {

    @BindView(R.id.textView)
    public TextView textView;

    @BindString(R.string.app_name)
    public String appName;

    @BindArray(R.array.citys)
    public String[] citys;

    @BindBitmap(R.mipmap.ic_launcher)
    public Bitmap a;

    @BindColor(R.color.colorAccent)
    public int black;

    @OnClick(R.id.textView)
    public void showToast(){
        Toast.makeText(this, "is a click", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.textView)
    public boolean showLongToast(){
        Toast.makeText(this, "is a longclick", Toast.LENGTH_SHORT).show();
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        textView.setText(citys[1]);
    }
}
