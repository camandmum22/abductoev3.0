package ufo.alien.space.ab_duc_toe_v2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button acerca;
    private Button playVsOther;
    private Button playVsMachine;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        acerca=(Button) findViewById(R.id.acerca);
        playVsOther=(Button) findViewById(R.id.playVsOther);
        playVsMachine=(Button) findViewById(R.id.playVsMachine);

        //Play Sound
        mp = MediaPlayer.create(getApplicationContext(), R.drawable.ufo1);
        mp.setLooping(true);
        /*mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
            }
        });*/
        mp.start();

    }

    public void acerca(View view){
        Intent i = new Intent(this, Information.class);
        startActivity(i);
    }

    public void vsOther(View view){
        Intent i = new Intent(this, GameVsPerson.class);
        startActivity(i);
    }

    public void vsMachine(View view){
        Intent i = new Intent(this, GameVsMachine.class);
        startActivity(i);
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
