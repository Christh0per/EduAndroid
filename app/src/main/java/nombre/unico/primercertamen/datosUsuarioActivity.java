package nombre.unico.primercertamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class datosUsuarioActivity extends AppCompatActivity {

    private Button btnRegistro;
    private EditText pass, confirm, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_usuario);

        this.btnRegistro = findViewById(R.id.btnRegister);
        this.username = findViewById(R.id.impUser);
        this.pass = findViewById(R.id.impPass);
        this.confirm = findViewById(R.id.impConfirm);

        this.btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String password = pass.getText().toString().trim();
                String confirmar = confirm.getText().toString().trim();
                String usname = username.getText().toString().trim();

                if(!usname.equals("")){
                    if(!password.equals("") && password.equals(confirmar)){
                        Toast.makeText(getApplicationContext(), password, Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Contraseña obligatoria", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(), "Nombre de usuario obligatorio", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
