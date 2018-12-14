package com.jetlight.amine_smahi.inssen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DonnorActivity extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "Amine Smahi","Oussama Bonnor",
            "Mohammed Benothman","Abed kibbir",
            "Oussama Zauoi",
            "Amine Smahi","Oussama Bonnor",
            "Mohammed Benothman","Abed kibbir",
            "Oussama Zauoi",
            "Amine Smahi","Oussama Bonnor",
            "Mohammed Benothman","Abed kibbir",
            "Oussama Zauoi",
            "Amine Smahi","Oussama Bonnor",
            "Mohammed Benothman","Abed kibbir",
            "Oussama Zauoi",
    };

    String[] subtitle ={
            "2 miles","5 miles",
            "4 miles","7 miles",
            "8 miles",
            "2 miles","5 miles",
            "4 miles","7 miles",
            "8 miles",
            "2 miles","5 miles",
            "4 miles","7 miles",
            "8 miles",
            "2 miles","5 miles",
            "4 miles","7 miles",
            "8 miles",
    };

    Integer[] imgid={
            R.mipmap.avatar1,R.mipmap.avatar2,
            R.mipmap.avatar3,R.mipmap.avatar1,
            R.mipmap.avatar2,
            R.mipmap.avatar1,R.mipmap.avatar2,
            R.mipmap.avatar3,R.mipmap.avatar1,
            R.mipmap.avatar2,
            R.mipmap.avatar1,R.mipmap.avatar2,
            R.mipmap.avatar3,R.mipmap.avatar1,
            R.mipmap.avatar2,
            R.mipmap.avatar1,R.mipmap.avatar2,
            R.mipmap.avatar3,R.mipmap.avatar1,
            R.mipmap.avatar2,
    };

    public void CallHim(View view)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0123456789"));
        startActivity(intent);
    }
    public void ViewProfile(View view)
    {
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donnor);
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
