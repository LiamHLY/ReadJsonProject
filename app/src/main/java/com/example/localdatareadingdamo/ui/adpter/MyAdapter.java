package com.example.localdatareadingdamo.ui.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.localdatareadingdamo.R;
import com.example.localdatareadingdamo.ui.entity.ProductEntity;
import com.example.localdatareadingdamo.ui.utils.DataUtil;
import com.example.localdatareadingdamo.ui.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyAdapter extends BaseAdapter {
    public TextView productName,loanAmount,loanRate,loanDescription,salesVolume;
    public ImageView icon;
    int resourceId;
    List<ProductEntity> productEntities = new ArrayList<>();
    Context context;

    public MyAdapter(Context context,int resourceId, List<ProductEntity> productEntities){
        this.productEntities.addAll(productEntities);
        this.resourceId = resourceId;
        this.context = context;
    }

    @Override
    public int getCount() {
        return productEntities.size();
    }

    @Override
    public Object getItem(int i) {
        return productEntities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ProductEntity productEntity = (ProductEntity) getItem(position);
        View view;
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(resourceId,parent,false);
        }else {
            view = convertView;
        }

        icon = view.findViewById(R.id.iv_icon);
        productName  = view.findViewById(R.id.tv_name);
        loanAmount = view.findViewById(R.id.tv_amount);
        loanRate = view.findViewById(R.id.tv_rate);
        loanDescription = view.findViewById(R.id.tv_feature);
        salesVolume = view.findViewById(R.id.tv_loan_time);
        setData(productEntity,position);
        return view;
    }

    private void setData( ProductEntity productEntity,int position) {
        if(productEntity.loan_amount.size()>1) {
            String min = productEntity.loan_amount.get(0);
            String max = productEntity.loan_amount.get(productEntity.loan_amount.size() - 1);
            loanAmount.setText(productEntity.currency_unit + "\u2000" + StringUtils.formatPrice(min,false) + "~" + StringUtils.formatPrice(max,false));

        }else if(productEntity.loan_amount.size()==1){
            loanAmount.setText(productEntity.currency_unit + "\u2000" +StringUtils.formatPrice(productEntity.loan_amount.get(0),false ));
        }else {
            loanAmount.setText("");
        }
        productName.setText(productEntity.name);
        loanRate.setText(productEntity.loan_rate_display);
        loanDescription.setText(productEntity.feature);
        salesVolume.setText(productEntity.sales_volume + "\u2000" +"Orang Mengunduh");
        Map<String,Integer> map =  DataUtil.images;
        int value =0;

        for (Map.Entry<String, Integer> m :map.entrySet())  {

            if (m.getKey().equals(productEntity.images)) {

                value = m.getValue();

            }}
        if(value!=0){
            icon.setImageResource(value);
        }

        //Glide.with(context).load(productEntity.images).into(icon);
    }
}
