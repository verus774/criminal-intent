package by.verus.criminalintent;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class CrimeHolder extends RecyclerView.ViewHolder {

    private Crime mCrime;
    private TextView mTitleTextView;
    private TextView mDateTextView;
    private CheckBox mSolvedCheckBox;

    public CrimeHolder(View itemView) {
        super(itemView);

        mTitleTextView = (TextView) itemView.findViewById(R.id.list_item_crime_title_text_view);
        mDateTextView = (TextView) itemView.findViewById(R.id.list_item_crime_date_text_view);
        mSolvedCheckBox = (CheckBox) itemView.findViewById(R.id.list_item_crime_solved_check_box);
    }

    public void bindCrime(Crime crime) {
        mCrime = crime;

        mTitleTextView.setText(mCrime.getTitle());
        mDateTextView.setText(mCrime.getDate().toString());
        mSolvedCheckBox.setChecked(mCrime.isSolved());
    }


}
