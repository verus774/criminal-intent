package by.verus.criminalintent.activity;

import android.support.v4.app.Fragment;

import by.verus.criminalintent.fragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
