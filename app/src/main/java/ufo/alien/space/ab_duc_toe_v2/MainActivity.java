package ufo.alien.space.ab_duc_toe_v2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button acerca;
    private Button playVsOther;
    private Button playVsMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acerca=(Button) findViewById(R.id.acerca);
        playVsOther=(Button) findViewById(R.id.playVsOther);
        playVsMachine=(Button) findViewById(R.id.playVsMachine);
    }

    public void acreca(View view){
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


    public void unJugador(View view){
        Intent intent= new Intent(this, GameVsMachine.class);
        startActivity(intent);
    }
    public void dosJugadores(View view){
        Intent intent= new Intent(this, GameVsPerson.class);
        startActivity(intent);
    }
}
