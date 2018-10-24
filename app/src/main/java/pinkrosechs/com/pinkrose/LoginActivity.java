package pinkrosechs.com.pinkrose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText plotno, password;
    Button signin;
    TextView owner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        plotno = (EditText) findViewById(R.id.editText);
        password =(EditText)findViewById(R.id.editText2);
        owner = (TextView)findViewById(R.id.tvname);


        signin=(Button)findViewById(R.id.button3);

signin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(plotno.getText().toString().equals("R-01") && password.getText().toString().equals("afaq"))//|| plotno.getText().toString().equals("R-02")|| plotno.getText().toString().equals("R-03") )

        {
        Intent intent= new Intent(LoginActivity.this,MainActivity.class);
        // owner.setText(getIntent().getStringExtra("mytext"));
         // startActivity(intent);






            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To AFAQ AHmed , Plot size'157.82' ", Toast.LENGTH_SHORT).show();

            }
        }
        else if(plotno.getText().toString().equals("R-02") && password.getText().toString().equals("shagufta"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To SHAGUFTA TABASSUM , Plot size'120' ", Toast.LENGTH_SHORT).show();

            }
        }

        else if(plotno.getText().toString().equals("R-03") && password.getText().toString().equals("zulfiqar"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To ZULFIQAR SHEIKH , Plot size'120' ", Toast.LENGTH_SHORT).show();

            }
        }
        else if(plotno.getText().toString().equals("R-04") && password.getText().toString().equals("liaquat"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To LIAQUAT ALI , Plot size'120' ", Toast.LENGTH_SHORT).show();

            }
        }
        else if(plotno.getText().toString().equals("R-06") && password.getText().toString().equals("uzma"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To UZMA TABASSUM , Plot size'120' ", Toast.LENGTH_SHORT).show();

            }
        }
        else if(plotno.getText().toString().equals("R-10") && password.getText().toString().equals("saima"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To SAIMA NASEEM , Plot size'120' ", Toast.LENGTH_SHORT).show();

            }
        }
        else if(plotno.getText().toString().equals("R-11") && password.getText().toString().equals("hina"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To HINA HABIB , Plot size'85' ", Toast.LENGTH_SHORT).show();

            }
        }
        else if(plotno.getText().toString().equals("R-12") && password.getText().toString().equals("ahsan"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To AHSAN HABIB , Plot size'164' ", Toast.LENGTH_SHORT).show();

            }
        }
        else if(plotno.getText().toString().equals("R-13") && password.getText().toString().equals("khuram"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To KHURAM HABIB , Plot size'120' ", Toast.LENGTH_SHORT).show();

            }
        }


        else if(plotno.getText().toString().equals("R-02") && password.getText().toString().equals("imtiaz"))

        {
            Intent intent= new Intent(LoginActivity.this,MainActivity.class);

            startActivity(intent);
            for (int i=0; i < 2; i++) {


                Toast.makeText(getApplicationContext(), "Wellcome To IMTIAZ AHMED, Plot size'120' ", Toast.LENGTH_SHORT).show();

            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "Failed login...",Toast.LENGTH_SHORT).show();
        }
    }
});

    }







}
