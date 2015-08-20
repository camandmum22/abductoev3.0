package ufo.alien.space.ab_duc_toe_v2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GameVsMachine extends Activity {

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
    private String mensaje2;
    private String mensaje3;
    private String mensaje4;

    private boolean turnoCPU;

    private MediaPlayer mySound;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_vs_machine);

        but1=(ImageButton) findViewById(R.id.ca00);
        but2=(ImageButton) findViewById(R.id.ca01);
        but3=(ImageButton) findViewById(R.id.ca02);
        but4=(ImageButton) findViewById(R.id.ca10);
        but5=(ImageButton) findViewById(R.id.ca11);
        but6=(ImageButton) findViewById(R.id.ca12);
        but7=(ImageButton) findViewById(R.id.ca20);
        but8=(ImageButton) findViewById(R.id.ca21);
        but9=(ImageButton) findViewById(R.id.ca22);

        but1.setClickable(true);
        but2.setClickable(true);
        but3.setClickable(true);
        but4.setClickable(true);
        but5.setClickable(true);
        but6.setClickable(true);
        but7.setClickable(true);
        but8.setClickable(true);
        but9.setClickable(true);

        but1.setImageResource(R.mipmap.ufo);
        but2.setImageResource(R.mipmap.ufo);
        but3.setImageResource(R.mipmap.ufo);
        but4.setImageResource(R.mipmap.ufo);
        but5.setImageResource(R.mipmap.ufo);
        but6.setImageResource(R.mipmap.ufo);
        but7.setImageResource(R.mipmap.ufo);
        but8.setImageResource(R.mipmap.ufo);
        but9.setImageResource(R.mipmap.ufo);


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
        mensaje = "You are safe!!";
        mensaje2="Both are death";
        mensaje3="You have been abducted!";
        mensaje4="Exit";
        turnoCPU = false;

        //Play Sound
        mp = MediaPlayer.create(getApplicationContext(), R.drawable.vs_machine);
        mp.setLooping(true);
        /*mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
            }
        });*/
        mp.start();
    }

    public void onBut1(View v){
        Toast.makeText(getApplicationContext(),"Test",Toast.LENGTH_SHORT);
        if(this.jugador==0 && but1.isClickable()){
            casilla1 = "X";
            but1.setImageResource(R.mipmap.cruz2);//
            but1.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }
        }
        else if (this.jugador==1 && but1.isClickable()){
            casilla1 = "O";
            but1.setImageResource(R.mipmap.circulo2);//
            but1.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }
        }
    }

    public void onBut2(View view){
        if(this.jugador==0 && but2.isClickable()){
            casilla2 = "X";
            but2.setImageResource(R.mipmap.cruz2);//
            but2.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but2.isClickable()){
            casilla2 = "O";
            but2.setImageResource(R.mipmap.circulo2);//
            but2.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void onBut3(View view){
        if(this.jugador==0 && but3.isClickable()){
            casilla3 = "X";
            but3.setImageResource(R.mipmap.cruz2);//
            but3.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but3.isClickable()){
            casilla3 = "O";
            but3.setImageResource(R.mipmap.circulo2);//
            but3.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void onBut4(View view){
        if(this.jugador==0 && but4.isClickable()){
            casilla4 = "X";
            but4.setImageResource(R.mipmap.cruz2);//
            but4.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje3,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but4.isClickable()){
            casilla4 = "O";
            but4.setImageResource(R.mipmap.circulo2);//
            but4.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void onBut5(View view){
        if(this.jugador==0 && but5.isClickable()){
            casilla5 = "X";
            but5.setImageResource(R.mipmap.cruz2);//
            but5.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but5.isClickable()){
            casilla5 = "O";
            but5.setImageResource(R.mipmap.circulo2);//
            but5.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void onBut6(View view){
        if(this.jugador==0 && but6.isClickable()){
            casilla6 = "X";
            but6.setImageResource(R.mipmap.cruz2);//
            but6.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but6.isClickable()){
            casilla6 = "O";
            but6.setImageResource(R.mipmap.circulo2);//
            but6.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void onBut7(View view){
        if(this.jugador==0 && but7.isClickable()){
            casilla7 = "X";
            but7.setImageResource(R.mipmap.cruz2);//
            but7.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but7.isClickable()){
            casilla7 = "O";
            but7.setImageResource(R.mipmap.circulo2);//
            but7.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){
                    mensaje="They tied";
                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void onBut8(View view){
        if(this.jugador==0 && but8.isClickable()){
            casilla8 = "X";
            but8.setImageResource(R.mipmap.cruz2);//
            but8.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but8.isClickable()){
            casilla8 = "O";
            but8.setImageResource(R.mipmap.circulo2);//
            but8.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void onBut9(View view){
        if(this.jugador==0 && but9.isClickable()){
            casilla9 = "X";
            but9.setImageResource(R.mipmap.cruz2);//
            but9.setClickable(false);

            int fin = this.juegoAcabado();

            if(fin!=-1){
                if(fin==0){

                    showDialog(mensaje,mensaje,mensaje4);
                }

                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }

            }
            if(fin != 2) {
                this.jugador = 1;
                juegaCpu();
            }
            else{//fin == 2
                //showMessage()
            }

        }
        else if (this.jugador==1 && but9.isClickable()){
            casilla9 = "O";
            but9.setImageResource(R.mipmap.circulo2);//
            but9.setClickable(false);

            int fin= this.juegoAcabado();

            if(fin!=-1){
                if(fin==1){

                    showDialog(mensaje, mensaje3, mensaje4);
                }
                else if(fin==2){

                    showDialog(mensaje,mensaje2,mensaje4);
                }
            }
            if(fin != 2) {
                this.jugador = 0;
            }
            else{//fin == 2
                //showMessage()
            }

        }
    }

    public void showDialog(String titulo, String mensaje, String aceptar){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage(mensaje)
                .setTitle("")
                .setCancelable(false)
                .setNeutralButton(aceptar,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                startActivity(new Intent(GameVsMachine.this, MainActivity.class));
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();

        //Toast.makeText(getApplicationContext(), "You Can Try Again!!!", Toast.LENGTH_SHORT);

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

    public String mejorCasilla(String jugador){
        /*if(this.but5.isClickable()){
            if (casilla2.equals("-1") && casilla3.equals("-1") &&
                    casilla4.equals("-1") && casilla7.equals("-1") &&
                    casilla5.equals("-1") && casilla9.equals("-1")) {
                return "casilla5";
            }
        }
        else */if(this.but1.isClickable()){
            if ((casilla2.equals(jugador) && casilla3.equals(jugador)) ||
                    (casilla4.equals(jugador) && casilla7.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla9.equals(jugador))) {
                return "casilla1";
            }
        }
        else if(this.but2.isClickable()){
            if ((casilla1.equals(jugador) && casilla3.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla8.equals(jugador))) {
                return "casilla2";
            }
        }
        else if(this.but3.isClickable()){
            if ((casilla1.equals(jugador) && casilla2.equals(jugador)) ||
                    (casilla6.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla7.equals(jugador))) {
                return "casilla3";
            }
        }
        else if(this.but4.isClickable()){
            if ((casilla1.equals(jugador) && casilla7.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla6.equals(jugador))) {
                return "casilla4";
            }
        }

        else if(this.but5.isClickable()){
            if ((casilla2.equals(jugador) && casilla8.equals(jugador)) ||
                    (casilla3.equals(jugador) && casilla7.equals(jugador)) ||
                    (casilla4.equals(jugador) && casilla6.equals(jugador))||
                    (casilla1.equals(jugador) && casilla9.equals(jugador))) {
                return "casilla5";
            }
        }
        else if(this.but6.isClickable()){
            if ((casilla3.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla4.equals(jugador) && casilla5.equals(jugador))) {
                return "casilla6";
            }
        }
        else if(this.but7.isClickable()){
            if ((casilla1.equals(jugador) && casilla4.equals(jugador)) ||
                    (casilla8.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla3.equals(jugador))) {
                return "casilla7";
            }
        }
        else if(this.but8.isClickable()){
            if ((casilla7.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla2.equals(jugador) && casilla5.equals(jugador))) {
                return "casilla8";
            }
        }
        else if(this.but9.isClickable()){
            if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
                    (casilla1.equals(jugador) && casilla5.equals(jugador))||
                    (casilla8.equals(jugador) && casilla7.equals(jugador))) {
                return "casilla9";
            }
        }

        return "-1";
    }

    public String casillaAleatoria(){
        Random random = new Random();
        List<Integer> vacias = new ArrayList<Integer>();

        if(this.but1.isClickable())
            vacias.add(1);
        if(this.but2.isClickable())
            vacias.add(2);
        if(this.but3.isClickable())
            vacias.add(3);
        if(this.but4.isClickable())
            vacias.add(4);
        if(this.but5.isClickable())
            vacias.add(5);
        if(this.but6.isClickable())
            vacias.add(6);
        if(this.but7.isClickable())
            vacias.add(7);
        if(this.but8.isClickable())
            vacias.add(8);
        if(this.but9.isClickable())
            vacias.add(9);

        int x = 0;

        if(vacias.size() > 0) {
            x = random.nextInt(vacias.size());
            return "casilla"+ vacias.get(x);
        }
        return "casilaNN";
    }

    public void juegaCpu(){
        String s = mejorCasilla("O");

        if(s.equals("-1")){
            s = mejorCasilla("X");

            if(s.equals("-1"))
                s = casillaAleatoria();
        }

        if(s.equals("casilla1")){
            onBut1(null);
        }
        else if(s.equals("casilla2")){
            onBut2(null);
        }
        else if(s.equals("casilla3")){
            onBut3(null);
        }
        else if(s.equals("casilla4")){
            onBut4(null);
        }
        else if(s.equals("casilla5")){
            onBut5(null);
        }
        else if(s.equals("casilla6")){
            onBut6(null);
        }
        else if(s.equals("casilla7")){
            onBut7(null);
        }
        else if(s.equals("casilla8")){
            onBut8(null);
        }
        else if(s.equals("casilla9")){
            onBut9(null);
        }
    }

    public void limpiar(View view){
        casilla1="-1";
        but1.setImageResource(R.color.transparent);
        but1.setClickable(true);

        casilla2="-1";
        but2.setImageResource(R.color.transparent);
        but2.setClickable(true);

        casilla3="-1";
        but3.setImageResource(R.color.transparent);
        but3.setClickable(true);

        casilla4="-1";
        but4.setImageResource(R.color.transparent);
        but4.setClickable(true);

        casilla5="-1";
        but5.setImageResource(R.color.transparent);
        but5.setClickable(true);

        casilla6="-1";
        but6.setImageResource(R.color.transparent);
        but6.setClickable(true);

        casilla7="-1";
        but7.setImageResource(R.color.transparent);
        but7.setClickable(true);

        casilla8="-1";
        but8.setImageResource(R.color.transparent);
        but8.setClickable(true);

        casilla9="-1";
        but9.setImageResource(R.color.transparent);
        but9.setClickable(true);

        if(!turnoCPU){
            jugador=1;
            juegaCpu();
            turnoCPU = true;
        }
        else if (turnoCPU){
            jugador=0;
            turnoCPU = false;
        }
    }
}