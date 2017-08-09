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

public class CgScheduleDays extends LinearLayout {

    TextView days;
    TextView text;


    public CgScheduleDays (Context c){
        super(c);

        LayoutInflater.from(c).inflate(R.layout.cg_schedule_days,this);

        text=findViewById(R.id.scheduledays_textview_text);
        days=findViewById(R.id.scheduledays_textview_days);
    }

    public TextView getText(){
        return this.text;
    }
    public TextView getDays(){
        return this.days;
    }

    public void setTypeFace(Typeface tf){

        days.setTypeface(tf);
        text.setTypeface(tf);

    }

}
