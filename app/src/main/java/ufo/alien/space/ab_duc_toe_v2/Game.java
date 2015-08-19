package ufo.alien.space.ab_duc_toe_v2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;


public class Game extends ActionBarActivity {

    private ImageButton[][] matriz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        matriz = new ImageButton[3][3];
        matriz[0][0] =  (ImageButton) findViewById(R.id.ca00);
        matriz[0][1] =  (ImageButton) findViewById(R.id.ca01);
        matriz[0][2] =  (ImageButton) findViewById(R.id.ca02);
        matriz[1][0] =  (ImageButton) findViewById(R.id.ca10);
        matriz[1][1] =  (ImageButton) findViewById(R.id.ca11);
        matriz[1][2] =  (ImageButton) findViewById(R.id.ca12);
        matriz[2][0] =  (ImageButton) findViewById(R.id.ca20);
        matriz[2][1] =  (ImageButton) findViewById(R.id.ca21);
        matriz[2][2] =  (ImageButton) findViewById(R.id.ca22);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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

    public void alien1(ImageButton boton){
        //boton.setImageResource(R.drawable.alien1);
        setContentView(R.layout.activity_game);
    }
}
