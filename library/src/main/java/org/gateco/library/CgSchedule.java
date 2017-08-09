package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 08/09/2017.
 */

public class CgSchedule extends LinearLayout {

    ImageView expand;
    TextView schedule;
    LinearLayout days;

    public CgSchedule (Context c){
        super(c);

        LayoutInflater.from(c).inflate(R.layout.cg_schedule,this);

        expand=findViewById(R.id.schedule_imageview_expand);
        schedule=findViewById(R.id.schedule_textview_schedule);
        days=findViewById(R.id.schedule_linearlayout_days);
    }

    public ImageView getExpand(){
        return this.expand;
    }

    public TextView getSchedule(){
        return this.schedule;
    }
    public LinearLayout getDays(){
        return this.days;
    }
    public void setTypeFace(Typeface tf){

        schedule.setTypeface(tf);
    }

}
