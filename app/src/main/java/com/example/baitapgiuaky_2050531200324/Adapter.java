package com.example.baitapgiuaky_2050531200324;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    ArrayList<Detail> moTa;
    @Override
    public int getCount() {
        return moTa.size();
    }

    @Override
    public Object getItem(int i) {
        return moTa.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewtemp;
        if(view == null){
            viewtemp = View.inflate(viewGroup.getContext(),R.layout.customlistview,null);

        }
        else{
            viewtemp = view;
        }

        Detail detail = moTa.get(i);
        TextView ten = viewtemp.findViewById(R.id.name_ed);
        TextView tuoi = viewtemp.findViewById(R.id.tuoi_ed);

        ImageView imageView = viewtemp.findViewById(R.id.imageView);

        ten.setText(detail.ten);
        tuoi.setText(detail.tuoi);

        String gioiTinh = detail.gioiTinh;
        if(gioiTinh.equals("Nam")){
            imageView.setImageResource(R.drawable.boy);
        }
        
        return null;
    }
}
