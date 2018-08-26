package view.list.herlina_sertifikasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.namaValue);
        TextView nohp = (TextView) findViewById(R.id.nohpValue);
        TextView email = (TextView) findViewById(R.id.emailValue);
        nama.setText(b.getCharSequence("nama"));
        nohp.setText(b.getCharSequence("nohp"));
        email.setText(b.getCharSequence("email"));
    }
}
