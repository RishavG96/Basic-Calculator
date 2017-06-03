package rcpl.com.stp17firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView t;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.editText);
        et2=(EditText) findViewById(R.id.editText2);
        t=(TextView)findViewById((R.id.textView));
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button4);
        b3=(Button) findViewById(R.id.button6);
        b4=(Button) findViewById(R.id.button7);
        b5=(Button) findViewById(R.id.button8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter first number!",Toast.LENGTH_SHORT).show();
                else if (et2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter second number!",Toast.LENGTH_SHORT).show();
                else {
                    String num1 = et1.getText().toString();
                    String num2 = et2.getText().toString();
                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);
                    int sum = n1 + n2;
                    t.setText("The sum is: " + sum);
                }


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter first number!",Toast.LENGTH_SHORT).show();
                else if (et2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter second number!",Toast.LENGTH_SHORT).show();
                else {
                    String num1 = et1.getText().toString();
                    String num2 = et2.getText().toString();
                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);
                    int sub = n1 - n2;
                    t.setText("The diff is: " + sub);


                }}
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter first number!",Toast.LENGTH_SHORT).show();
                else if (et2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter second number!",Toast.LENGTH_SHORT).show();
                else {
                    String num1 = et1.getText().toString();
                    String num2 = et2.getText().toString();
                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);
                    int mul = n1 * n2;
                    t.setText("The mul is: " + mul);



            }
        }});
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter first number!",Toast.LENGTH_SHORT).show();
                else if (et2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter second number!",Toast.LENGTH_SHORT).show();
                else {
                    String num1 = et1.getText().toString();
                    String num2 = et2.getText().toString();
                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);
                    double div = n1 / n2;
                    t.setText("The div is: " + div);


                }}
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter first number!",Toast.LENGTH_SHORT).show();
                else if (et2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this,"Enter second number!",Toast.LENGTH_SHORT).show();
                else {
                    String num1 = et1.getText().toString();
                    String num2 = et2.getText().toString();
                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);
                    double mod = n1 % n2;
                    t.setText("The mod is: " + mod);

            }}
        });

    }
}
