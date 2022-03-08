
package com.example.et1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Scanner ;

public class MainActivity extends AppCompatActivity {
    boolean bol1 = false;
    boolean bol2 = false;
    boolean bol3 = false;
    int num1;
    int num2;
    int mone;
    int ans ;
    TextView tv11 ;
    TextView tv12 ;
    TextView tv21 ;
    TextView tv22 ;
    TextView tv31 ;
    TextView tv32 ;
    EditText et1;
    EditText et2;
    EditText et3;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Scanner in= new Scanner(System.in) ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            num1 = (int) (10 + (Math.random() * 89));
            num2 = (int) (10 + (Math.random() * 89));

        tv11 = findViewById(R.id.tv11);
        tv12 = findViewById(R.id.tv12);
        tv21 = findViewById(R.id.tv21);
        tv22 = findViewById(R.id.tv22);
        tv31 = findViewById(R.id.tv31);
        tv32 = findViewById(R.id.tv32);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        iv1= findViewById(R.id.iV1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);




    }


    public void pressed1(View view) {
        while (bol1 = false) {
            bol1= true ;
            num1 = (int) (10 + (Math.random() * 89));
            num2 = (int) (10 + (Math.random() * 89));
            tv11.setText(""+ num1) ;
            tv12.setText (""+ num2) ;
            ans = num1 + num2 ;
            String str = et1.getText().toString() ;
            int kel = Integer.parseInt(str) ;
            if ( num1 +num2  = kel )
                iv1.setImageResource(R.drawable.vvv);
            else
                iv1.setImageResource(R.drawable.xxx);



        }
    }

    public void pressed2(View view) {
        while ((bol1 = true) && (bol2 = false)) {
            bol2 = true ;
            tv21.setText(""+ans );
            num1 = ans ;
            num2 = (int) (10 + (Math.random() * 89));
            ans = num1+ num2 ;
            String str = et2.getText().toString() ;
             int kel = Integer.parseInt(str) ;
            if (num1+num2= kel )
                iv1.setImageResource(R.drawable.vvv);
            else
                iv1.setImageResource(R.drawable.xxx);


        }

    }
    public void pressed3(View view) {
        while ((bol1 = true) && (bol2 = true)) {
             num1 = ans ;
             num2 = 10 +( (Math.random() * 89));
            String str = et3.getText().toString() ;
            int kel = Integer.parseInt(str) ;
            if (num1+num2= kel )
                iv1.setImageResource(R.drawable.vvv);
            else
                iv1.setImageResource(R.drawable.xxx);

        }

    }
    public void reset(View view) {
    bol1= false ;
    bol2= false ;
    bol3 = false ;

    }


}