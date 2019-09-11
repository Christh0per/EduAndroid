package nombre.unico.primercertamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSiguiente;
    private EditText impName, impAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.impName = findViewById(R.id.txtName);
        this.btnSiguiente = findViewById(R.id.btnSiguiente);





            this.btnSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String name = impName.getText().toString();

                    if(!name.equals("")){

                        Intent siguienteDatos = new Intent(MainActivity.this, datosContactoActivity.class);
                        startActivity(siguienteDatos);

                    }else {
                        Toast.makeText(getApplicationContext(), "Nombre obligatorio", Toast.LENGTH_SHORT).show();
                    }
                }
            });






    }
}
