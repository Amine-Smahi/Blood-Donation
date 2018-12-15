package com.jetlight.amine_smahi.inssen;

import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private Spinner spinner2;
    private static final String[] paths = {"Oran", "Tlemsen", "Something long"};
    private static final String[] types = {"AB+", "AB-", "O+"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
       // WebView browser = (WebView) findViewById(R.id.webview);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this,
                android.R.layout.simple_spinner_item, paths);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(SearchActivity.this,
                android.R.layout.simple_spinner_item, types);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);
       /* browser.setWebViewClient(new WebViewClient() {
                                     public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                                         handler.proceed();
                                     }
                                 });
        browser.loadUrl("https://google-developers.appspot.com/maps/documentation/javascript/examples/full/map-simple");*/
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void MyProfile(View view)
    {
        Intent intent = new Intent(this,AccountActivity.class);
        startActivity(intent);
    }
}