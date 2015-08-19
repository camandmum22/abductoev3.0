package ufo.alien.space.ab_duc_toe_v2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class GameVsPerson extends Activity {

    private ImageButton but1;
    private ImageButton but2;
    private ImageButton but3;
    private ImageButton but4;
    private ImageButton but5;
    private ImageButton but6;
    private ImageButton but7;
    private ImageButton but8;
    private ImageButton but9;

    private String casilla1;
    private String casilla2;
    private String casilla3;
    private String casilla4;
    private String casilla5;
    private String casilla6;
    private String casilla7;
    private String casilla8;
    private String casilla9;

    private int jugador;
    //private String textofinal;
    private String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_vs_person);

        but1=(ImageButton) findViewById(R.id.ca00);
        but2=(ImageButton) findViewById(R.id.ca01);
        but3=(ImageButton) findViewById(R.id.ca02);
        but4=(ImageButton) findViewById(R.id.ca10);
        but5=(ImageButton) findViewById(R.id.ca11);
        but6=(ImageButton) findViewById(R.id.ca12);
        but7=(ImageButton) findViewById(R.id.ca20);
        but8=(ImageButton) findViewById(R.id.ca21);
        but9=(ImageButton) findViewById(R.id.ca22);


        casilla1=new String("-1");
        casilla2=new String("-1");
        casilla3=new String("-1");
        casilla4=new String("-1");
        casilla5=new String("-1");
        casilla6=new String("-1");
        casilla7=new String("-1");
        casilla8=new String("-1");
        casilla9=new String("-1");

        jugador = 0;
        //textofinal = "";
        mensaje = "";
    }

    public void onBut1(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla1 = "X";
            but1.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla1 = "O";
            but1.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut2(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla2 = "X";
            but2.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla2 = "O";
            but2.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut3(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla3 = "X";
            but3.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla3 = "O";
            but3.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut4(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla4 = "X";
            but4.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla4 = "O";
            but4.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut5(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla5 = "X";
            but5.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla5 = "O";
            but5.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut6(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla6 = "X";
            but6.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla6 = "O";
            but6.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut7(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla7 = "X";
            but7.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla7 = "O";
            but7.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut8(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla8 = "X";
            but8.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla8 = "O";
            but8.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void onBut9(View view){
        if(this.jugador==0 && view.isClickable()){
            casilla9 = "X";
            but9.setBackgroundResource(R.drawable.cruz);//
            view.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){
                    mensaje="Win Crosses";
                    showDialog(mensaje,mensaje,mensaje);
                }

                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }

            }
            this.jugador=1;

        }
        else if (this.jugador==1 && view.isClickable()){
            casilla9 = "O";
            but9.setBackgroundResource(R.drawable.circulo);//
            view.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){
                    mensaje="Win Circles";
                    showDialog(mensaje, mensaje, mensaje);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje,mensaje);
                }
            }
            this.jugador=0;

        }
    }

    public void showDialog(String mensaje, String titulo, String aceptar){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(mensaje)
                .setTitle(titulo)
                .setCancelable(false)
                .setNeutralButton(aceptar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();

        Toast.makeText(getApplicationContext(), "You Can Try Again!!!", Toast.LENGTH_SHORT);

    }

    public void fin(){
        but1.setClickable(false);
        but2.setClickable(false);
        but3.setClickable(false);
        but4.setClickable(false);
        but5.setClickable(false);
        but6.setClickable(false);
        but7.setClickable(false);
        but8.setClickable(false);
        but9.setClickable(false);
    }

    public int juegoAcabado(){
		 /* Diagonales */
        if(!but1.isClickable() && !but5.isClickable()  && !but9.isClickable()&& casilla1.equals(casilla5) && casilla1.equals(casilla9)){
            fin();
            return jugador;
        }
        if(!but3.isClickable() && !but5.isClickable()  && !but7.isClickable()&& casilla3.equals(casilla5)&& casilla3.equals(casilla7)){
            fin();
            return jugador;
        }

		/* Horizontales */
        if(!but1.isClickable() && !but2.isClickable()  && !but3.isClickable()&& casilla1.equals(casilla2) && casilla1.equals(casilla3)){
            fin();
            return jugador;
        }

        if(!but4.isClickable() && !but5.isClickable()  && !but6.isClickable()&& casilla4.equals(casilla5) && casilla4.equals(casilla6)){
            fin();
            return jugador;
        }

        if(!but7.isClickable() && !but8.isClickable()  && !but9.isClickable() && casilla7.equals(casilla8) && casilla7.equals(casilla9)){
            fin();
            return jugador;
        }
        /* Verticales */
        if(!but1.isClickable() && !but4.isClickable()  && !but7.isClickable()&& casilla1.equals(casilla4) && casilla1.equals(casilla7)){
            fin();
            return jugador;
        }

        if(!but2.isClickable() && !but5.isClickable()  && !but8.isClickable() && casilla2.equals(casilla5) && casilla2.equals(casilla8)){
            fin();
            return jugador;
        }

        if(!but3.isClickable() && !but6.isClickable()  && !but9.isClickable()&& casilla3.equals(casilla6) && casilla3.equals(casilla9)){
            fin();
            return jugador;
        }

        if(!but1.isClickable() && !but3.isClickable()  && !but3.isClickable() && !but4.isClickable() && !but5.isClickable()  && !but6.isClickable()
                && !but7.isClickable() && !but8.isClickable()  && !but9.isClickable() ){
            fin();
            return 2;//empate
        }
        return -1;//continua el juego
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_vs_person, menu);
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

    public void limpiar(View view){
        casilla1="-1";
        but1.setBackgroundResource(R.drawable.vacia);
        but1.setClickable(true);

        casilla2="-1";
        but2.setBackgroundResource(R.drawable.vacia);
        but2.setClickable(true);

        casilla3="-1";
        but3.setBackgroundResource(R.drawable.vacia);
        but3.setClickable(true);

        casilla4="-1";
        but4.setBackgroundResource(R.drawable.vacia);
        but4.setClickable(true);

        casilla5="-1";
        but5.setBackgroundResource(R.drawable.vacia);
        but5.setClickable(true);

        casilla6="-1";
        but6.setBackgroundResource(R.drawable.vacia);
        but6.setClickable(true);

        casilla7="-1";
        but7.setBackgroundResource(R.drawable.vacia);
        but7.setClickable(true);

        casilla8="-1";
        but8.setBackgroundResource(R.drawable.vacia);
        but8.setClickable(true);

        casilla9="-1";
        but9.setBackgroundResource(R.drawable.vacia);
        but9.setClickable(true);

        jugador = 0;
    }
}
