package by.verus.criminalintent.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import by.verus.criminalintent.fragment.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID = "crime_id";

    @Override
    protected Fragment createFragment() {
        long crimeId = getIntent().getLongExtra(EXTRA_CRIME_ID, 0);
        return CrimeFragment.newInstance(crimeId);
    }

    public static Intent newIntent(Context packageContext, long crimeId) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }
}
