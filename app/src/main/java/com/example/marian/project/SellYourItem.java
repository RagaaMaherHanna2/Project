package com.example.marian.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SellYourItem extends AppCompatActivity
{
    @BindView(R.id.sell_scroll)
    ScrollView SellScroll;

    @BindView(R.id.sell_car_bar)
    Toolbar settingsBar;

    @BindView(R.id.add_img)
    ImageView carImg;

    @BindView(R.id.title_txt)
    EditText titleTxt;
    @BindView(R.id.desc_txt)
    EditText descTxt;
    @BindView(R.id.email_txt)
    EditText emailTxt;
    @BindView(R.id.loc_txt)
    EditText locTxt;
    @BindView(R.id.name_txt)
    EditText nameTxt;
    @BindView(R.id.phone_txt)
    EditText phoneTxt;
    @BindView(R.id.category_txt)
    EditText catTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_item);
        ButterKnife.bind(this);
    }
}
