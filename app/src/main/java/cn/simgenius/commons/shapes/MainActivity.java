package cn.simgenius.commons.shapes;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn).setBackgroundDrawable(new RoundCorner("#aa6699","#cc99aa",10).getDrawable());
    }
}
