package com.mirea.mingaraevaai.buttonclicker;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;




import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку No 17");
            } };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

    }
    //public void onMyButtonClick(View view) {

        //Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();

    //}
    public  void onMyButtonClick1(View view){

        checkBox.setChecked(!checkBox.isChecked());


        if (checkBox.isChecked()) {
            textViewStudent.setText("CheckBox включён");
        } else {
            textViewStudent.setText("CheckBox выключен");
        }

    }

}