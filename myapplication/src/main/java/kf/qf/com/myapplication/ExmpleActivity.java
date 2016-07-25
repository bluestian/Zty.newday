package kf.qf.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ExmpleActivity extends AppCompatActivity {
    ImageView authcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exmple);
        authcode = (ImageView) findViewById(R.id.register_iv);
    }

    public void  btnClick(View view){

        //将验证码用图片的形式显示出来
        authcode.setImageBitmap(Authcode.getInstance().createBitmap());
        String code = Authcode.getInstance().getCode();
        authcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

}
