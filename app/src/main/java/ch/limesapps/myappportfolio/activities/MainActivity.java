package ch.limesapps.myappportfolio.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /* called when user touches the buttons */
    public void showToast(View view) {
        String appName = "";
        int i = view.getId();
        if (i == R.id.btn_spotify_streamer) {
            appName = getString(R.string.spotify_streamer_app_name);
        } else if (i==R.id.btn_scores_app){
            appName=getString(R.string.scores_app);
        } else if (i==R.id.btn_library_app){
            appName=getString(R.string.library_app);
        } else if (i==R.id.btn_build_it_bigger){
            appName=getString(R.string.build_it_bigger);
        } else if (i==R.id.btn_xyz_reader){
            appName=getString(R.string.xyz_reader);
        } else if (i==R.id.btn_capstone){
            appName=getString(R.string.capstone_app);
        }
        final String text = String.format(getString(R.string.toast_text), appName);
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
