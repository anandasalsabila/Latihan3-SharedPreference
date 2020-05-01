package com.caca.latihan3_sharedpreference.shapre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.caca.latihan3_sharedpreference.R;
import com.caca.latihan3_sharedpreference.utils.Preferences;

public class HomeActivity extends AppCompatActivity {
    /*
   NIM     : 10117133
   Nama    : Ananda Salsabila
   Kelas   : IF4
   Matkul  : Aplikasi Komputasi Bergerak
   Tugas   : AKB-Tugas-3-SharedPreference


    */
//    1 Mei 2020, 21.13 WIB : Tugas Selesai
//    1 Mei 2020, Membuat apk rilis dan mengirim file ke email. Dan upload ke github
    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }
    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
