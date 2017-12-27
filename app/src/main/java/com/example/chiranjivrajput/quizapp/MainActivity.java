package com.example.chiranjivrajput.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0;
    public void decrease(View view)
{
    if(a<1)
    {
        Context c =getApplicationContext();
        CharSequence c1="Negative cores are not possible";
        int t= Toast.LENGTH_SHORT;
        Toast to=Toast.makeText(c,c1,t);
        to.show();
    }
    else {
        a--;
        TextView t = (TextView) findViewById(R.id.cores);
        t.setText(""+a);
    }
}
    public void increase(View view)
    {
        if(a>16)
        {
            Context c =getApplicationContext();
            CharSequence c1="cores more than 36 are not avialable for personal use";
            int t= Toast.LENGTH_SHORT;
            Toast to=Toast.makeText(c,c1,t);
            to.show();
        }
        else {
            a++;
            TextView t = (TextView) findViewById(R.id.cores);
            t.setText(""+a);
        }
    }
    public void counterr(View view)
    {
        int n=0,x=0,x1=0;
        CheckBox a=(CheckBox) findViewById(R.id.a);
        boolean ba=a.isChecked();
        CheckBox b=(CheckBox) findViewById(R.id.b);
        boolean bb=b.isChecked();
        CheckBox c=(CheckBox) findViewById(R.id.c);
        boolean bc=c.isChecked();
        CheckBox d=(CheckBox) findViewById(R.id.d);
        boolean bd=d.isChecked();
        CheckBox a1=(CheckBox) findViewById(R.id.a1);
        boolean ba1=a1.isChecked();
        CheckBox b1=(CheckBox) findViewById(R.id.b1);
        boolean bb1=b1.isChecked();
        CheckBox c1=(CheckBox) findViewById(R.id.c1);
        boolean bc1=c1.isChecked();
        CheckBox d1=(CheckBox) findViewById(R.id.d1);
        boolean bd1=d1.isChecked();
        if(ba==true)
        {
            x++;
        }
        if(bb==true)
        {
            x++;
        } if(bc==true)
    {
        x++;
    } if(bd==true)
    {
        x++;
    }
        if(ba1==true)
        {
            x1++;
        }
        if(bb1==true)
        {
            x1++;
        }
        if(bc1==true)
        {
            x1++;
        }
        if(bd1==true) {
            x1++;
        }
        if(x==1&&x1==1)
        {
            if(bb==true)
                n++;
            if(ba1==true)
                n++;
            EditText e=(EditText) findViewById(R.id.editText);
            String s=e.getText().toString();
            String s1="Disk Operating System";
            if(s.equalsIgnoreCase(s1)) {
                n++;
            }
            EditText e1=(EditText) findViewById(R.id.edit1);
            String se=e1.getText().toString();
            String se1="Graphical Game";
            if(se.equalsIgnoreCase(se1))
                n++;
            TextView tv=(TextView) findViewById(R.id.cores);
            int i=Integer.parseInt(tv.getText().toString());
            if(i==16)
                n++;
            Context co=getApplicationContext();
            CharSequence cs1="You got "+n+" marks";
            int in=Toast.LENGTH_SHORT;
            Toast t=Toast.makeText(co,cs1,in);
            t.show();
        }
        else
        {
            Context c11=getApplicationContext();
            CharSequence cs="There are more than one checked in answer please select one option in multiple choice ";
            int t1=Toast.LENGTH_SHORT;
            Toast t=Toast.makeText(c11,cs,t1);
            t.show();
        }
    }
}
