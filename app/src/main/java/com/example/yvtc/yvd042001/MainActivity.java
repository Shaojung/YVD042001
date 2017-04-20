package com.example.yvtc.yvd042001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickWrite(View v)
    {
        File dir = getFilesDir();
        Log.d("MFILE", dir.toString());

        File writeFile = new File(dir.toString() + File.separator + "mydata.txt");
        try {
            FileWriter fw = new FileWriter(writeFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
