package com.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class HomeActivity extends Activity {

    private Context mContext;
    ListView sdkFunctionalityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mContext = HomeActivity.this;
        //Activity mActivity = HomeActivity.this;

        TextView txtDemo = (TextView) findViewById(R.id.txtDemo);
        TextView txtCodeSnip = (TextView) findViewById(R.id.txtCodeSnip);
        TextView txtMaterialLibrary = (TextView) findViewById(R.id.txtMaterialLibrary);

        txtDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intdemo = new Intent(mContext, MainActivity.class);
                startActivity(intdemo);
            }
        });

        txtCodeSnip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcode = new Intent(mContext, CodeSnippestHomeActivity.class);
                startActivity(intcode);
            }
        });

        txtMaterialLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcode = new Intent(mContext, MaterialLibrariesListActivity.class);
                startActivity(intcode);
            }
        });
    }

}
