package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 08/09/2017.
 */

public class CgCatview extends LinearLayout {

    ImageView pic;
    TextView category;

    public CgCatview (Context c){
        super(c);

        LayoutInflater.from(c).inflate(R.layout.cg_catview,this);

        pic=findViewById(R.id.catview_imageview_pic);
        category=findViewById(R.id.catview_textview_category);
    }

    public ImageView getPic(){
        return this.pic;
    }

    public TextView getCategory(){
        return this.category;
    }
    public void setTypeFace(Typeface tf){

        category.setTypeface(tf);
    }

}
