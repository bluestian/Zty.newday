package baseactivitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 84903 on 2016/5/29.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        initMethod();
        loadDataMethod();

    }

    protected void initMethod() {

    }


    protected void loadDataMethod() {

    }

    //getlayoutview method;
   protected abstract  int getContentView();


}
