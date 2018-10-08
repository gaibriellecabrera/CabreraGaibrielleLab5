package gaibrielle.cabrera.com.cabreragaibriellelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }

    public void prevScreen(View v){
        Intent i = null, chooser= null;
        if (v.getId() == R.id.btnAct1){
            i = new Intent(this, MainActivity.class); //sender ang this, recipient ang Activity2
            startActivity(i);
        }
        else if (v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.576362, 120.984186")); //pass lat and longitude ng place
            chooser = Intent.createChooser(i, "Select an application to open Map:");//change name nung chooser prompt
            startActivity(chooser);
        }
    }
}
