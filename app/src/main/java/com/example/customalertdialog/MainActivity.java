package com.example.customalertdialog;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.username);
        textView2=findViewById(R.id.email);
        button=findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                View view=getLayoutInflater().inflate(R.layout.custom_dialog,null);
                builder.setView(view);
                final EditText editText=view.findViewById(R.id.edit1);
                final EditText editText2=view.findViewById(R.id.edit2);
                  Button confirm=view.findViewById(R.id.btn2);
                final AlertDialog dialog=builder.create();
                dialog.show();

                confirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(editText.getText().toString());
                        textView2.setText(editText2.getText().toString());
                        dialog.dismiss();
                    }
                });

            }
        });

    }
}
