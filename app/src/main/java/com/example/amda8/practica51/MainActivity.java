package com.example.amda8.practica51;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_hoteles) {
            FragmentManager fm = getSupportFragmentManager();
            HotelesFragment fragmento = new HotelesFragment();
            fm.beginTransaction().replace(R.id.contenedor, fragmento).commit();
        } else if (id == R.id.nav_sitios) {
            FragmentManager fm = getSupportFragmentManager();
            SitiosFragment fragmento = new SitiosFragment();
            fm.beginTransaction().replace(R.id.contenedor, fragmento).commit();

        } else if (id == R.id.nav_bares) {
            FragmentManager fm = getSupportFragmentManager();
            BaresFragment fragmento = new BaresFragment();
            fm.beginTransaction().replace(R.id.contenedor, fragmento).commit();

        } else if (id == R.id.nav_demografica) {
            FragmentManager fm = getSupportFragmentManager();
            demografiaFragment fragmento = new demografiaFragment();
            fm.beginTransaction().replace(R.id.contenedor, fragmento).commit();

        } else if (id == R.id.nav_inicio) {

            FragmentManager fm = getSupportFragmentManager();
            InicioFragment fragmento = new InicioFragment();
            fm.beginTransaction().replace(R.id.contenedor, fragmento).commit();

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void mapa_parques (View v){
        Intent i=new Intent(this,Maps_parque.class);
        startActivity(i);
    }
    public void mapa_muelles (View v){
        Intent i=new Intent(this,MapsMuelle.class);
        startActivity(i);
    }
    public void mapa_puentes (View v){
        Intent i=new Intent(this,Maps_puente.class);
        startActivity(i);
    }
    public void mapa_carnavals (View v){
        Intent i=new Intent(this,Maps_carnaval.class);
        startActivity(i);
    }
    public void mapa_barras (View v){
        Intent i=new Intent(this,Maps_barra.class);
        startActivity(i);
    }
    public void mapa_jaliscos (View v){
        Intent i=new Intent(this,Maps_jalisco.class);
        startActivity(i);
    }
    public void mapa_berrio (View v){
        Intent i=new Intent(this,Maps_PuertoBerrio.class);
        startActivity(i);
    }
    public void mapa_centrals (View v){
        Intent i=new Intent(this,Maps_central.class);
        startActivity(i);
    }
    public void mapa_malecones (View v){
        Intent i=new Intent(this,Maps_malecon.class);
        startActivity(i);
    }
    public void mapa_palmas (View v){
        Intent i=new Intent(this,Maps_palmas.class);
        startActivity(i);
    }


}
