package group.tonight.firimdownloadsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import group.tonight.firimsdk.SampleUpdateDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkUpdate(View view) {
        SampleUpdateDialog.getInstance().show(getSupportFragmentManager(), SampleUpdateDialog.class.getSimpleName());
    }
}
