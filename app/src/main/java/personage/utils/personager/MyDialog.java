package personage.utils.personager;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;

import kf.qf.com.ztynewday.R;

/**
 * Created by 84903 on 2016/6/28.
 */
public class MyDialog extends Dialog {

    private ImageView mMImg;

    public MyDialog(Context context) {
        super(context);
        findView();
    }

    protected MyDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public MyDialog(Context context, int themeResId) {
        super(context, themeResId);
    }
    public void findView(){
        LinearLayout layout= (LinearLayout) getLayoutInflater().inflate(R.layout.fragment_register_dialog, null);
        mMImg = (ImageView) layout.findViewById(R.id.register_iv_authcode);
        setContentView(layout);
    }
    public void setImg(Bitmap bm)
    {
        if(bm==null){
            return;
        }
        mMImg.setImageBitmap(bm);
        /*
        *http://blog.csdn.net/educast/article/details/38755287
        *
        * */
    }

}
