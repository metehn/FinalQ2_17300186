package me.metehanersoy.finalq2_17300186;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textViewResult;
    RadioGroup RGroup;
    Button button;
    EditText editText1,editText2;

    int number1;
    int number2;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("CMES419_Final_Q2");

        textViewResult = findViewById(R.id.textViewResult);
        RGroup = findViewById(R.id.RGroup);
        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    number1 = Integer.parseInt( editText1.getText().toString());
                    number2 = Integer.parseInt( editText2.getText().toString());

                    int selectedRadioButtonId = RGroup.getCheckedRadioButtonId();
                    if (selectedRadioButtonId != -1){
                        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                        String selectedRbText = selectedRadioButton.getText().toString();
                        if(selectedRbText.equals("+")){
                            result = number1 + number2;
                            textViewResult.setText(Integer.toString(result));

                        }else{
                            result = number1 - number2;
                            textViewResult.setText(Integer.toString(result));
                        }


                    }else{
                        Toast.makeText(MainActivity.this, "Select A Button !!!! ", Toast.LENGTH_SHORT).show();
                    }



                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Enter Number!!!! ", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}