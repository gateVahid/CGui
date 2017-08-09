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

public class CgPicview extends LinearLayout {

    ImageView pic;
    TextView name;

    public CgPicview (Context c){
        super(c);

        LayoutInflater.from(c).inflate(R.layout.cg_picview,this);

        pic=findViewById(R.id.picview_imageview_pic);
        name=findViewById(R.id.picview_textview_name);
    }

    public ImageView getPic(){
        return this.pic;
    }

    public TextView getName(){
        return this.name;
    }
     public void setTypeFace(Typeface tf){

         name.setTypeface(tf);
     }

}
