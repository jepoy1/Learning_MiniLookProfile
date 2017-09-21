/*
*   This is a practice code whereas a user can click on a picture, then shows its profile information like social
*   media applications will do. This is created by me, the one and only Jep Estaris.
*   THIS IS INTENDED FOR STUDY PURPOSES ONLY. RE-USE IT AT YOUR OWN RISK.
*   */
package estaris.learning_minilookprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intanciate xml gridview:
        GridView grid_profileList = (GridView) findViewById(R.id.grid_profileList);
        //Create a custom Adapter that extends BaseAdapter; that accepts Images and name it as ImageAdapter.
        grid_profileList.setAdapter(new ImageAdapter(this));

        //View OnItemClickListener:
        //OnItemClick obtains access to it's constructors
        grid_profileList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " " + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
