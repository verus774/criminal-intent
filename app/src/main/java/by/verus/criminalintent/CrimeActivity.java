package by.verus.criminalintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        Log.d("ddd", Crime.getAll().toString());
    }
}
