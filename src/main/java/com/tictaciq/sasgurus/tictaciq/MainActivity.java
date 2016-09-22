package com.tictaciq.sasgurus.tictaciq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
  boolean pTurn;  // variable to check if it is player's turn

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

      b1 = (Button) findViewById(R.id.b1);
      b2 = (Button) findViewById(R.id.b2);
      b3 = (Button) findViewById(R.id.b3);
      b4 = (Button) findViewById(R.id.b4);
      b5 = (Button) findViewById(R.id.b5);
      b6 = (Button) findViewById(R.id.b6);
      b7 = (Button) findViewById(R.id.b7);
      b8 = (Button) findViewById(R.id.b8);
      b9 = (Button) findViewById(R.id.b9);

      pTurn = true;

      b1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          // check if it is player's turn
          if(b1.getText().toString().equals("")) {
            if (pTurn) {
              b1.setText("X");
              pTurn = false;
            } else {
              b1.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b2.getText().toString().equals("")) {
            if (pTurn) {
              b2.setText("X");
              pTurn = false;
            } else {
              b2.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b3.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b3.getText().toString().equals("")) {
            if (pTurn) {
              b3.setText("X");
              pTurn = false;
            } else {
              b3.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b4.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b4.getText().toString().equals("")) {
            if (pTurn) {
              b4.setText("X");
              pTurn = false;
            } else {
              b4.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b5.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b5.getText().toString().equals("")) {
            if (pTurn) {
              b5.setText("X");
              pTurn = false;
            } else {
              b5.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b6.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b6.getText().toString().equals("")) {
            if (pTurn) {
              b6.setText("X");
              pTurn = false;
            } else {
              b6.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b7.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b7.getText().toString().equals("")) {
            if (pTurn) {
              b7.setText("X");
              pTurn = false;
            } else {
              b7.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b8.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b8.getText().toString().equals("")) {
            if (pTurn) {
              b8.setText("X");
              pTurn = false;
            } else {
              b8.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b9.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b9.getText().toString().equals("")) {
            if (pTurn) {
              b9.setText("X");
              pTurn = false;
            } else {
              b9.setText("O");
              pTurn = true;
            }
          }
        }
      });

    /*
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          .setAction("Action", null).show();
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

    return super.onOptionsItemSelected(item); */
  }
}
