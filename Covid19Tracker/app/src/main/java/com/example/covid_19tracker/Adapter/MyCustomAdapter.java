package com.example.covid_19tracker.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.covid_19tracker.Model.CountryModel;
import com.example.covid_19tracker.R;

import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<CountryModel> {

    private Context context;
    private List<CountryModel> countryModelList;

    public MyCustomAdapter(@NonNull Context context, List<CountryModel> countryModelList) {
        super(context, R.layout.list_custom_item,countryModelList);

        this.context = context;
        this.countryModelList = countryModelList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_custom_item,null,true);
        TextView tvCountryName = view.findViewById(R.id.countryName);
        ImageView imgCountryFlag = view.findViewById(R.id.countryImage);

        tvCountryName.setText(countryModelList.get(position).getCountryName());
        Glide.with(context).load(countryModelList.get(position).getCountryFlags()).into(imgCountryFlag);

        return view;
    }
}
