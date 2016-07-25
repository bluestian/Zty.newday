package kf.qf.com.ztynewday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import contact.person.fragments.ContactPersonFragment;
import gift.fragments.GiftFragment;
import information.fragments.InformationFragment;
import nearby.fragments.NearbyFragment;
import personage.fragments.PersonageFragment;

public class MainActivity extends AppCompatActivity {
   private ContactPersonFragment mPersonFragment;
    private  GiftFragment mGiftFragment;
    private InformationFragment mInformationFragment;
    private NearbyFragment mNearbyFragment;
    private PersonageFragment mPersonageFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRadio();
        initFragments();
    }

    private void initFragments() {
         mPersonFragment = new ContactPersonFragment();
        mGiftFragment = new GiftFragment();
         mInformationFragment = new InformationFragment();
         mNearbyFragment = new NearbyFragment();
        mPersonageFragment = new PersonageFragment();
    }

    private void initRadio() {
        RadioGroup mRadioGroup = (RadioGroup) findViewById(R.id.rg_rg_radio);
        mRadioGroup.getChildAt(0).performClick();
                mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.btn_rg_nearby:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.ac_fg, mNearbyFragment).commit();
                        break;
                    case R.id.btn_fg_information:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.ac_fg, mInformationFragment).commit();
                        break;
                    case R.id.btn_fg_contact:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.ac_fg, mPersonFragment).commit();
                        break;
                    case R.id.btn_rg_gift:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.ac_fg, mGiftFragment).commit();
                        break;
                    case R.id.btn_fg_personage:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.ac_fg, mPersonageFragment).commit();
                        break;
                }
            }

        });
    }

}
