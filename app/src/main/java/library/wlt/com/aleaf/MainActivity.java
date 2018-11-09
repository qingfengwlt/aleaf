package library.wlt.com.aleaf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseAppCompatActivity {

    ListView mLv;
    ArrayAdapter mAdapter;
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    @Override
    protected int resLayoutId() {
        return R.layout.activity_main;
    }

    protected void initUI() {
        mLv=findViewById(R.id.lv_main);
        list = new ArrayList<>();
        list.add("Test " );
        list.add("PickerView " );
        for (int i = 0; i < 10; i++) {
            list.add("item " + i);
        }
        mAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        mLv.setAdapter(mAdapter);
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this,TestActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,PickerViewActivity.class));
                        break;
                        default:
                            Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
                            break;
                }
            }
        });
    }

    @Override
    protected void initData() {

    }
}
