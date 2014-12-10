package com.cicada.app;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        final TextView tv = (TextView) findViewById(R.id.text_view);
        AsyncTask<String, Void, String> simpleGetTask =
                new AsyncTask<String, Void, String>() {


                    @Override
                    protected String doInBackground(String... params) {

                        RestTemplate restTemplate = new RestTemplate();

                        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());

                        return restTemplate.getForObject(params[0], String.class);
                    }

                    @Override
                    protected void onPostExecute(final String s) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tv.setText(s);
                            }
                        });


                    }
                };

        String url = "http://192.168.30.106:8080/banksteel?requestid=getBuyOrder";
        simpleGetTask.execute(url);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
