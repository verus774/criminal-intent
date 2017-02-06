package by.verus.criminalintent;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import by.verus.criminalintent.activity.CrimeActivity;

public class CrimeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private Crime mCrime;
    private TextView mTitleTextView;
    private TextView mDateTextView;
    private CheckBox mSolvedCheckBox;

    public CrimeHolder(View itemView) {
        super(itemView);

        mTitleTextView = (TextView) itemView.findViewById(R.id.list_item_crime_title_text_view);
        mDateTextView = (TextView) itemView.findViewById(R.id.list_item_crime_date_text_view);
        mSolvedCheckBox = (CheckBox) itemView.findViewById(R.id.list_item_crime_solved_check_box);

        itemView.setOnClickListener(this);
    }

    public void bindCrime(Crime crime) {
        mCrime = crime;

        mTitleTextView.setText(mCrime.getTitle());
        mDateTextView.setText(mCrime.getDate().toString());
        mSolvedCheckBox.setChecked(mCrime.isSolved());
    }


    @Override
    public void onClick(View v) {
        Intent intent = CrimeActivity.newIntent(v.getContext(), mCrime.getId());
        v.getContext().startActivity(intent);
    }
}
