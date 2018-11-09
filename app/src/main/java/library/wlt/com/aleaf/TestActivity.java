package library.wlt.com.aleaf;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class TestActivity extends BaseAppCompatActivity {
    @BindView(R.id.vp_test)
    ViewPager mVp;
    ComPagerAdapter<String> comPagerAdapter;
    List<String> mList;
    @Override
    protected int resLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected  void initUI() {
        mList=new ArrayList<>();
        for (int i=0;i<30;i++){
            mList.add(""+i);
        }
        comPagerAdapter=new ComPagerAdapter<String>(mList) {
            @Override
            public View newView(int position) {
                TextView textView =new  TextView(TestActivity.this);
                textView.setText("page"+position);
//                textView.setBackgroundColor(Color.BLACK);
                return textView;
            }
        };
        mVp.setAdapter(comPagerAdapter);
        mVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(TestActivity.this,"position="+position,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    protected void initData() {

    }
}
