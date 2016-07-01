package app.croos.com.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Mensaje extends AppCompatActivity {
    private EditText nnombre,napellido,ncedula;
    String nombre,apellido,cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        nnombre=(EditText)findViewById(R.id.rnombre);
        napellido=(EditText)findViewById(R.id.rapellido);
        ncedula=(EditText)findViewById(R.id.rcedula);

        recogerExtras();
    }

    public void recogerExtras(){
        Bundle extras= this.getIntent().getExtras();
        nombre=extras.getString("Nombre");
        apellido=extras.getString("Apellido");
        cedula=extras.getString("Cedula");

        nnombre.setText(nombre);
        napellido.setText(apellido);
        ncedula.setText(cedula);
    }

}
