package gaibrielle.cabrera.com.cabreragaibriellelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH","onCreate() is running...");
        Intent i = new Intent(this, myCustomService.class); //explicit
        startService(i);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ITH","onPause() is running...");
        Intent i = new Intent(this, myCustomService.class); //explicit
        startService(i);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ITH","onResume() is running...");
        Intent i = new Intent(this, myCustomService.class); //explicit
        startService(i);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITH","onStart() is running...");
        Intent i = new Intent(this, myCustomService.class); //explicit
        startService(i);
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITH","onStop() is running...");
        Intent i = new Intent(this, myCustomService.class); //explicit
        startService(i);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITH","onDestroy() is running...");
        Intent i = new Intent(this, myCustomService.class); //explicit
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser= null;
        if (v.getId() == R.id.btnAct2){
            i = new Intent(this, activity_screen2.class); //sender ang this, recipient ang Activity2
            startActivity(i);
        }
        else if (v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.589275, 120.975333")); //pass lat and longitude ng place
            chooser = Intent.createChooser(i, "Select an application to open Map:");//change name nung chooser prompt
            startActivity(chooser);
        }
    }
}
