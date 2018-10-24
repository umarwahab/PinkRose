package pinkrosechs.com.pinkrose;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Lenovo on 12/18/2017.
 */

public class fetchData extends AsyncTask<Void,Void,Void>{

String data="";
    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://api.myjson.com/bins/gc3w3");


            HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
            InputStream inputStream  = httpURLConnection.getInputStream();
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader( inputStream));

            String line="";

            while(line!= null)
            {
            line=bufferedReader.readLine();
            data= data+line;

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        SerachActivity.data.setText(this.data);

    }
}

