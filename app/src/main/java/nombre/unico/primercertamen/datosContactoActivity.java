package nombre.unico.primercertamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class datosContactoActivity extends AppCompatActivity {

    private Button btnSiguiente;
    private EditText impEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_contacto);

        this.btnSiguiente = findViewById(R.id.btnSiguiente);
        this.impEmail = findViewById(R.id.impEmail);

        this.btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = impEmail.getText().toString();

                if (!email.equals("")){

                    Intent siguienteUsuario = new Intent(datosContactoActivity.this, datosUsuarioActivity.class);
                    startActivity(siguienteUsuario);

                }else {
                    Toast.makeText(getApplicationContext(), "E-mail obligatorio", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
