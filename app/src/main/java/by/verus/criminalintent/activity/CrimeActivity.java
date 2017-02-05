package by.verus.criminalintent.activity;

import android.support.v4.app.Fragment;

import by.verus.criminalintent.fragment.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
