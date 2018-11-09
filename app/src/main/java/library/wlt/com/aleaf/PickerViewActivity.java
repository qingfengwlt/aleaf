package library.wlt.com.aleaf;

import android.os.Build;
import android.widget.Toast;

import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class PickerViewActivity extends BaseAppCompatActivity {

     @BindView(R.id.wv)
    WheelView wheelView;

    @Override
    protected int resLayoutId() {
        return R.layout.activity_picker_view;
    }

    @Override
    protected void initUI() {
        wheelView.setCyclic(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            wheelView.setTooltipText("sss");
        }
        final List<String> mOptionsItems = new ArrayList<>();
        mOptionsItems.add("item0");
        mOptionsItems.add("item1");
        mOptionsItems.add("item2");

        wheelView.setAdapter(new ArrayWheelAdapter(mOptionsItems));
        wheelView.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(PickerViewActivity.this, "" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void initData() {

    }
}
