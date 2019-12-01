package ferdy.com.utsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Profil extends AppCompatActivity {
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_STATUS = "extra_status";
    public static final String EXTRA_JOB = "extra_job";
    public static final String EXTRA_ADDRESS = "extra_address";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        TextView tvDataDiterima = findViewById(R.id.data_diterima);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String address = getIntent().getStringExtra(EXTRA_ADDRESS);
        String status = getIntent().getStringExtra(EXTRA_STATUS);
        String pekerjaan = getIntent().getStringExtra(EXTRA_JOB);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Nama : " + name + ",\nAlamat : "+ address + ",\nStatus : "+ status + ",\nPekerjaan : "+ pekerjaan + ",\nUmur : " + age;
        tvDataDiterima.setText(text);
    }

}
