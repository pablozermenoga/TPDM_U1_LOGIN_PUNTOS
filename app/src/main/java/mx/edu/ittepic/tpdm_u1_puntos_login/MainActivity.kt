package mx.edu.ittepic.tpdm_u1_puntos_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var user : EditText ?=null
    var contra : EditText ?= null
    var aceptar : Button?=null
    var u = arrayOf("pablo","tapia","roberto","uriel","miguel")
    var c = arrayOf("12345","12345","12345","12345","12345")
    var cont = 0
    var img : ImageView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user= findViewById(R.id.user)
        contra = findViewById(R.id.pass)
        aceptar = findViewById(R.id.btn)
        img = findViewById(R.id.img)



        btn?.setOnClickListener {
            if (user?.text.toString().equals(u.get(0)) && contra?.text.toString().equals(c.get(0))) {
                Toast.makeText(this, "SESION INICIADA", Toast.LENGTH_LONG).show()
            }
            else if (user?.text.toString().equals(u.get(1)) && contra?.text.toString().equals(c.get(1))) {
                Toast.makeText(this, "SESION INICIADA", Toast.LENGTH_LONG).show()
            } else if (user?.text.toString().equals(u.get(2)) && contra?.text.toString().equals(c.get(2))) {
                Toast.makeText(this, "SESION INICIADA", Toast.LENGTH_LONG).show()
            } else if (user?.text.toString().equals(u.get(3)) && contra?.text.toString().equals(c.get(3))) {
                Toast.makeText(this, "SESION CORRECTA", Toast.LENGTH_LONG).show()
            } else if (user?.text.toString().equals(u.get(4)) && contra?.text.toString().equals(c.get(4))) {
                Toast.makeText(this, "sesion correcta", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "ERROR", Toast.LENGTH_LONG).show()
                cont++

                if(cont>=3){
                    finish()
                }
            }

        }
    }
}
