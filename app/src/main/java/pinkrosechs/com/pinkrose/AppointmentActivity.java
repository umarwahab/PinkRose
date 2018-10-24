package pinkrosechs.com.pinkrose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AppointmentActivity extends AppCompatActivity {
    EditText Toemail, name,visit;
    Button Snd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        Toemail = (EditText) findViewById(R.id.editname);

        name = (EditText) findViewById(R.id.editphone);


        visit = (EditText) findViewById(R.id.editvisit);
        Snd = (Button) findViewById(R.id.send);
        Snd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String to = Toemail.getText().toString();

                String naam = name.getText().toString();
                String reason = visit.getText().toString();

                Intent imail = new Intent(Intent.ACTION_SEND);
                imail.putExtra(Intent.EXTRA_EMAIL, new String[]{to});

                imail.putExtra(Intent.EXTRA_SUBJECT, naam);


                imail.putExtra(Intent.EXTRA_TEXT, reason);
                imail.setType("message/rfc822");
                startActivity(Intent.createChooser(imail, "choos an email client"));
                try {
                    startActivity(Intent.createChooser(imail, "Send mail..."));
                    finish();

                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(AppointmentActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
