package ferdy.com.utsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKalkulator = findViewById(R.id.kalkulator);
        btnKalkulator.setOnClickListener(this);
        Button btnProfil = findViewById(R.id.profil);
        btnProfil.setOnClickListener(this);
        Button btnDial = findViewById(R.id.dial);
        btnDial.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.kalkulator:
                Intent moveKalkulator = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(moveKalkulator);
                break;
            case R.id.profil:
                Intent moveProfil = new Intent(MainActivity.this, Profil.class);
                moveProfil.putExtra(Profil.EXTRA_NAME, "Ferdy Baliansyah R.");
                moveProfil.putExtra(Profil.EXTRA_ADDRESS, "Kopang");
                moveProfil.putExtra(Profil.EXTRA_STATUS, "Single");
                moveProfil.putExtra(Profil.EXTRA_JOB, "Guru");
                moveProfil.putExtra(Profil.EXTRA_AGE, 30);
                startActivity(moveProfil);
                break;
            case R.id.dial:
                String phoneNumber = "087849910278";
                Intent dialNomor = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialNomor);
                break;
        }
    }
}
