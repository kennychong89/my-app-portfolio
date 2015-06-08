package com.nano.kenny.myapplicationportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button aboutMeButton;
    private Button spotifyProjectButton;
    private Button scoresProjectButton;
    private Button libraryProjectButton;
    private Button buildItProjectButton;
    private Button XYZReaderProjectButton;
    private Button capstoneProjectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutMeButton = (Button)findViewById(R.id.about_me);
        spotifyProjectButton = (Button)findViewById(R.id.spotify_project);
        scoresProjectButton = (Button)findViewById(R.id.scores_project);
        libraryProjectButton = (Button)findViewById(R.id.library_project);
        buildItProjectButton = (Button)findViewById(R.id.built_project);
        XYZReaderProjectButton = (Button)findViewById(R.id.xyz_project);
        capstoneProjectButton = (Button) findViewById(R.id.capstone_project);


        initButtonWithListener(aboutMeButton, "About me");
        initButtonWithListener(spotifyProjectButton, "Spotify project");
        initButtonWithListener(scoresProjectButton, "Scores project");
        initButtonWithListener(libraryProjectButton, "Library project");
        initButtonWithListener(buildItProjectButton, "Build project");
        initButtonWithListener(XYZReaderProjectButton, "XYZ project");
        initButtonWithListener(capstoneProjectButton, "Capstone project");
    }

    private void initButtonWithListener(Button button, final CharSequence toastStr) {
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), toastStr, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
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
