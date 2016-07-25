package personage.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import basefragments.BaseFragment;
import kf.qf.com.ztynewday.R;
import personage.utils.personager.Authcode;
import personage.utils.personager.MyDialog;

/**
 * Created by 84903 on 2016/5/30.
 */
public class PersonageFragment extends BaseFragment {
    private LinearLayout registerDailog,logginDailog;
    private  ImageView authcode;
    private ImageView mImg;

    @Override
    protected int contentViewGetid() {
        return R.layout.fragment_personage;
    }



    @Override
    protected void init(View view) {
        super.init(view);
        initRegister(view);
        initLogging(view);
    }
   //init dialog methed;
   @Override
    protected void initDialog(Bundle savedInstanceState) {
        super.initDialog(savedInstanceState);
        registerDailog= (LinearLayout) getLayoutInflater(savedInstanceState).inflate(
                R.layout.fragment_register_dialog, null);
       mImg = (ImageView) registerDailog.findViewById(R.id.register_iv_authcode);
       logginDailog= (LinearLayout) getLayoutInflater(savedInstanceState)
                .inflate(R.layout.fragment_logging_dialog, null);

    }



    //into logging ui;
    private void initLogging(View view) {
           Button mLogging = (Button) view.findViewById(R.id.psg_bt_logging);
           mLogging.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   // startActivity(new Intent(getContext(),PersonagerLogin.class));
                   MyDialog dialog=new MyDialog(getContext());
                   dialog.show();
               }
           });
    }

    //into register ui;
    private void initRegister(View view) {
        Button mRegister = (Button) view.findViewById(R.id.psg_bt_register);
      /*  authcode = (ImageView) view.findViewById(R.id.register_iv_authcode);
        //将验证码用图片的形式显示出来

        authcode.setImageBitmap(Authcode.getInstance().createBitmap());
        String code = Authcode.getInstance().getCode();*/
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // startActivity(new Intent(getContext(),PersonagerRegister.class));
                MyDialog dialog=new MyDialog(getContext());
                dialog.setImg(Authcode.getInstance().createBitmap());
                dialog.show();
            }
        });

    }



    private void initAuthCode(View view) {


       /* authcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });*/
    }

}
