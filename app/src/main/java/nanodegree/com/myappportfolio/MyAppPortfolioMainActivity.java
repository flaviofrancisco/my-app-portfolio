package nanodegree.com.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyAppPortfolioMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio_main, menu);
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

    public void onSpotifyStreamerClick(View view) {
            message("Spotify Streamer App");
    }

    public void onCapstoneMyOwnAppClick(View view) {
        message("Capstone: My Own App");
    }

    public void onXyzReaderClick(View view)
    {
        message("XYZ Reader App");
    }

    public void onLibraryAppClick(View view) {
        message("Library App");
    }

    public void onBuildItBiggerClick(View view){
        message("Build It Bigger App");
    }

    public void onScoresAppClick(View view) {
        message("Scores App");
    }

    public void message(String appName){

        Context context = getApplicationContext();
        CharSequence text = String.format("This button will lunch my %s !",appName);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
