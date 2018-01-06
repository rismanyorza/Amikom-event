package com.funkies.presentasiandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


public class KaosAdapter extends  ArrayAdapter<String>{

    private final AppCompatActivity context;
    private final String[] NamaKaos;
    private final Integer[] GbrKaos;

    public KaosAdapter(AppCompatActivity context, String[] NamaKaos, Integer[] GbrKaos) {
        super(context, R.layout.mylist, NamaKaos);


        this.context=context;
        this.NamaKaos=NamaKaos;
        this.GbrKaos=GbrKaos;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        txtTitle.setText(NamaKaos[position]);
        imageView.setImageResource(GbrKaos[position]);

        return rowView;

    };
}
