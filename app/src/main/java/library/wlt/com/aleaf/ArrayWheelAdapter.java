package library.wlt.com.aleaf;

import com.contrarywind.adapter.WheelAdapter;

import java.util.List;

/**
 * Created by PC_WLT on 2018/11/8.
 */

public class ArrayWheelAdapter<T> implements WheelAdapter {

    // items
    private List<T> items;

    /**
     * Constructor
     * @param items the items
     */
    public ArrayWheelAdapter(List<T> items) {
        this.items = items;

    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return "";
    }

    @Override
    public int getItemsCount() {
        return items.size();
    }

    @Override
    public int indexOf(Object o){
        return items.indexOf(o);
    }
}
