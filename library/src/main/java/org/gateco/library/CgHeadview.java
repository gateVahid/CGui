package org.gateco.library;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vahid on 08/09/2017.
 */

public class CgHeadview extends LinearLayout {

    Button more;
    TextView text;

    public CgHeadview (Context c){
        super(c);

        LayoutInflater.from(c).inflate(R.layout.cg_headview,this);

        more=findViewById(R.id.headview_button_more);
        text=findViewById(R.id.headview_textview_text);
    }

    public Button getMore(){
        return this.more;
    }

    public TextView getCategory(){
        return this.text;
    }
    public void setTypeFace(Typeface tf){

        text.setTypeface(tf);
        more.setTypeface(tf);
    }

}
