package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class Problem17 extends AppCompatActivity {

    EditText Edidtext1p17, Edidtext2p17, Edidtext3p17 ;
    TextView Tvdisplayp17;
    Button Buttonp17;




    float a, b, c;
    float root1, root2, imaginary;
    float discriminant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem17);



        //=======================================
        Edidtext1p17 = findViewById(R.id.edittext1p17);
        Edidtext2p17 = findViewById(R.id.edittext2p17);
        Edidtext3p17 = findViewById(R.id.edittext3p17);
        Tvdisplayp17 = findViewById(R.id.tvdisplayp17);
        Buttonp17 = findViewById(R.id.buttonp17);
        //=======================================


        Buttonp17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String    one = Edidtext1p17.getText().toString();
              String  two = Edidtext2p17.getText().toString();
               String three = Edidtext3p17.getText().toString();

                a = Float.parseFloat(one);
                b = Float.parseFloat(two);
                c = Float.parseFloat(three);




                discriminant = (b * b) - (4 * a * c);


                /* Find the nature of discriminant */
                if(discriminant > 0)
                {
                    root1 = (float) ((-b + sqrt(discriminant)) / (2*a));
                    root2 = (float) ((-b - sqrt(discriminant)) / (2*a));

                    Tvdisplayp17.setText( "Two distinct and real roots exists: " + "\n" + root1 + "\n" + root2);
                }
                else if(discriminant == 0)
                {
                    root1 = root2 = -b / (2 * a);

                    Tvdisplayp17.setText( "Two equal and real roots exists: " + "\n" + root1 + "\n" + root2);
                }
                else if(discriminant < 0)
                {
                    root1 = root2 = -b / (2 * a);
                    imaginary = (float) (sqrt(-discriminant) / (2 * a));

                    Tvdisplayp17.setText("Two distinct complex roots exists:" + "\n"
                            + root1 + "\n" + imaginary + "\n" + root2 + "\n" + imaginary);
                }




            }
        });
        //=======================================================



    }
}
