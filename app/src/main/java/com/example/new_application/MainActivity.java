    package com.example.new_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity{
   EditText etID;
   Button btnSubmit;
   TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: complete this
      etID=findViewById(R.id.etID);
      btnSubmit=findViewById(R.id.btnSubmit);
      tvResult=findViewById(R.id.tvResult);
      btnSubmit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String sID=etID.getText().toString().trim();
              String dob=sID.substring(0,6);
              int gender=Integer.parseInt(sID.charAt(6)+"");
              String sGender;
              if(gender==0)
              {
                  sGender="Female";
              }
          else
              {
                  sGender="Male";
              }
          int nationality=Integer.parseInt(sID.charAt(10)+"");
          String sNationality;
          if(nationality==0)
          {
              sNationality="SA National";
          }
          else
              sNationality="Permanent Resident";
          tvResult.setText("Date of Birth"+dob+"\nGender"+sGender+"\nNationality"+nationality);
          }
      });
    }
}