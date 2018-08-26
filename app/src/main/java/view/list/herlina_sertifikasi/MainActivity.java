package view.list.herlina_sertifikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText nama, nohp, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViewsId();
        button.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.button1);
        nama = (EditText) findViewById(R.id.nama);
        nohp = (EditText) findViewById(R.id.nomer);
        email = (EditText) findViewById(R.id.email);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        Bundle b = new Bundle();
        b.putString("nama", nama.getText().toString());
        b.putString("nohp", nohp.getText().toString());
        b.putString("email", email.getText().toString());
        intent.putExtras(b);
        startActivity(intent);}
}
