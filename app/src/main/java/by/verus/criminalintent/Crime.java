package by.verus.criminalintent;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "crimes")
public class Crime extends Model {

    @Column(name = "title")
    private String mTitle;

    public Crime() {
        super();
    }

    public Crime(String title) {
        super();

        this.mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public static List<Crime> getAll() {
        return new Select()
                .from(Crime.class)
                .orderBy("title ASC")
                .execute();
    }

    public static Crime findById(long id) {
        return new Select()
                .from(Crime.class)
                .where("Id = ?", id)
                .executeSingle();
    }

    public static void deleteAll() {
        new Delete().from(Crime.class).execute();
    }

    public static void generateCrimes(int count) {
        ActiveAndroid.beginTransaction();
        try {
            for (int i = 1; i <= count; i++) {
                new Crime("Crime #" + i).save();
            }
            ActiveAndroid.setTransactionSuccessful();
        } finally {
            ActiveAndroid.endTransaction();
        }

    }

    @Override
    public String toString() {
        return "crime: [" + this.mTitle + "]";
    }
}
