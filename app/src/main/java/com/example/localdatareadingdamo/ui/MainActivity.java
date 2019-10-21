package com.example.localdatareadingdamo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.localdatareadingdamo.R;
import com.example.localdatareadingdamo.ui.adpter.MyAdapter;
import com.example.localdatareadingdamo.ui.entity.ProductEntity;
import com.example.localdatareadingdamo.ui.utils.DataUtil;

import com.example.localdatareadingdamo.ui.utils.SchemeHelper;

import java.util.ArrayList;
;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<ProductEntity> productEntities = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataUtil.initData(getApplicationContext());
        productEntities = DataUtil.HOME.products.data;
        listView = findViewById(R.id.list_view);
        MyAdapter adapter = new MyAdapter(MainActivity.this,R.layout.item_product,DataUtil.HOME.products.data);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ProductEntity productEntity = productEntities.get(i);
                Log.d("11","111");
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (productEntity.scheme_url.startsWith("https:")) {
                    try {
                        Uri content_url = Uri.parse(productEntity.scheme_url);
                        intent.setData(content_url);
                        startActivity(intent);
                    }catch (Exception e){

                    }

                }else{
                    try {
                        Uri content_url = Uri.parse( productEntity.downloan_scheme_url);
                        intent.setData(content_url);
                        startActivity(intent);
                    }catch (Exception e){

                    }

                }
            }
        });

    }
    private void images(){
    }
}
