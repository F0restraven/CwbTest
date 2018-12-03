package iii.forest.cwbtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tw.brad.bradlibrary.CwbOpenData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    CwbOpenData cwbOpenData = new CwbOpenData(this);

    cwbOpenData.getReport

}
