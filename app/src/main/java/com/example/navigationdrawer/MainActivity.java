package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){

            drawerLayout.closeDrawer(GravityCompat.START);
        }else {

            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch(id){

            case R.id.drafts_id:
                Toast.makeText(getApplicationContext(),"drafts",Toast.LENGTH_LONG).show();
                break;
            case R.id.inbox_id:
                Toast.makeText(getApplicationContext(),"inbox",Toast.LENGTH_LONG).show();

                break;
            case R.id.mail_id:
                Toast.makeText(getApplicationContext(),"mail",Toast.LENGTH_LONG).show();

                break;
            case R.id.sent_id:
                Toast.makeText(getApplicationContext(),"sent",Toast.LENGTH_LONG).show();

                break;
            case R.id.spam_id:
                Toast.makeText(getApplicationContext(),"spam",Toast.LENGTH_LONG).show();

                break;
            case R.id.starred_id:
                Toast.makeText(getApplicationContext(),"starred",Toast.LENGTH_LONG).show();

                break;
            case R.id.trash_id:
                Toast.makeText(getApplicationContext(),"trash",Toast.LENGTH_LONG).show();

                break;

        }
          drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }
}
