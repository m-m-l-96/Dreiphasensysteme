package com.example.dps;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        String _m = bundle.getString("m");
        String _ul = bundle.getString("ul");
        String _u1 = bundle.getString("u1");
        String _u2 = bundle.getString("u2");
        String _u3 = bundle.getString("u3");

        TextView sx = (TextView) findViewById(R.id.sx);
        TextView sy = (TextView) findViewById(R.id.sy);
        TextView tx = (TextView) findViewById(R.id.tx);
        TextView ty = (TextView) findViewById(R.id.ty);
        TextView rx = (TextView) findViewById(R.id.rx);
        TextView ry = (TextView) findViewById(R.id.ry);
        TextView dx = (TextView) findViewById(R.id.dx);
        TextView dy = (TextView) findViewById(R.id.dy);
        TextView bx = (TextView) findViewById(R.id.bx);
        TextView by = (TextView) findViewById(R.id.by);

        double __m = Double.valueOf(_m);
        double __ul = Double.valueOf(_ul);
        double __u1 = Double.valueOf(_u1);
        double __u2 = Double.valueOf(_u2);
        double __u3 = Double.valueOf(_u3);

        double ll = __ul/__m;
        double ls = ll/ Math.sqrt(3);
        double ls__ = ls * Math.cos(Math.PI/6);
        double __ll = ll * Math.sin(Math.PI/3);
        double __ls = ls * Math.sin(Math.PI/6);
        double l1 = ls - (__u1/__m);
        double l2 = (-ls+ (__u2/__m)) * Math.cos(Math.PI/6);
        double l3 = (ls- (__u3/__m)) * Math.cos(Math.PI/6);
        double x__ = l2 + l3;
        double x = x__ + ls__;
        double y = l1 + __ls;

        double _rx =0.0;
        double _ry =0.0;
        double _tx = ll;
        double _ty =0.0;
        double _sx = ls__;
        double _sy = __ll;
        double _dx =ls__;
        double _dy =__ls;
        double _bx =x;
        double _by =y;

        sx.setText(""+_sx);
        sy.setText(""+_sy);
        rx.setText(""+_rx);
        ry.setText(""+_ry);
        tx.setText(""+_tx);
        ty.setText("" +_ty);
        dx.setText("" + _dx);
        dy.setText("" + _dy);
        bx.setText("" + _bx);
        by.setText("" + _by);




    }

}