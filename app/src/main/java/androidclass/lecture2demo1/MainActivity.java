package androidclass.lecture2demo1;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    String[] classes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        classes=getResources().getStringArray(R.array.myListofClasses);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.mynewlayout,classes));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent myIntnt=new Intent(this, ReadMSG.class);
        myIntnt.putExtra("myKeyMSG", "Hello My MSG");
        startActivity(myIntnt);

    }



}
