package library.wlt.com.aleaf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by PC_WLT on 2018/6/8.
 * 基类
 */

public abstract class BaseAppCompatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(resLayoutId());
        ButterKnife.bind(this);
        initUI();
        initData();
    }

    protected abstract int resLayoutId();

    protected abstract void initUI();

    protected abstract void initData();
}
