import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.benard.recipe.R;

/**
 * Created by benard on 8/29/16.
 */
public class fragmentone extends Fragment{
    ArrayAdapter<String>adapter;
    String []version;
    ListView  listview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.frangment_one_layout,container,false);
        listview=(ListView)view.findViewById(R.id.list_view);
        version=getResources().getStringArray(R.array.android_version);
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.list_view_layout,R.id.row_item,version);
        listview.setAdapter(adapter);
        return view;
    }
}
