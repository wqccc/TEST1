package com.example.bupt.ex4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME="name";
    private final static String CLASSES="classes";
    private final static String NUMBER="number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"王晴川","马艺立","wge"};
        String[] classes = {"计科1505","计科1503","软工1502"};
        String[] number = {"123","456","789"};

        List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();

        for(int i = 0;i < name.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put(NAME,name[i]);
            item.put(CLASSES,classes[i]);
            item.put(NUMBER,number[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLASSES,NUMBER},new int[]{R.id.txtName,R.id.txtClasses,R.id.txtNumber});
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}

