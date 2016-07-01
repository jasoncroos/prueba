package app.croos.com.ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre,Apellido,Cedula;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Definicion de Objetos
        Nombre=(EditText)findViewById(R.id.editText_nombre);
        Apellido=(EditText)findViewById(R.id.editText_apellido);
        Cedula=(EditText)findViewById(R.id.editText_cedula);

        boton=(Button)findViewById(R.id.btnEnviar);
        boton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //lanzarActivity(v,nombre.getText().toString(),apellido.getText().toString(),cedula.getText().toString());
                lanzarActivity();
            }
        });
    }

    /*public void lanzarActivity(View v,String n,String a,String c){
        Intent i=new Intent(MainActivity.this,Mensaje.class);
        i.putExtra("nombre",n);
        i.putExtra("apellido",a);
        i.putExtra("cedula",c);
        startActivity(i);
    }*/

    public void lanzarActivity(){
        Intent i=new Intent(MainActivity.this,Mensaje.class);
        String n,a,c;
        n=Nombre.getText().toString();
        a=Apellido.getText().toString();
        c=Cedula.getText().toString();

        i.putExtra("Nombre",n);
        i.putExtra("Apellido",a);
        i.putExtra("Cedula",c);
        startActivity(i);
    }
}
