import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import packt.reactivestocks.R;


/**
 * Created by utkarshak on 7/19/2017.
 */

public class MockActivitydemo extends AppCompatActivity {

    private String[] bigArray = new String[ 10000000];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock);
        bigArray[ 0] = "test";
        Log.i("APP", "Activity Created");
    }
    @Override
    protected void onDestroy() {
        Log.i("APP", "Activity Destroyed");
        super.onDestroy();
    }
}
