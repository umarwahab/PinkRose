package pinkrosechs.com.pinkrose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SerachActivity extends AppCompatActivity {
   public static TextView data;
    Button getdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serach);
data= (TextView) findViewById(R.id.textView3);
        getdata=(Button) findViewById(R.id.btndata);

        getdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData process = new fetchData();
                process.execute();
            }
        });


           // listView = (ListView) findViewById(R.id.listview);
           // getJSON("http://192.168.101.1/Android/getdata.php");
        }



    }
