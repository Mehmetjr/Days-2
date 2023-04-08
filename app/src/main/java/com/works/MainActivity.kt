package com.works

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnToast :Button
    lateinit var customToastView: View
    lateinit var edtAlert: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast= findViewById(R.id.btnToast)
        btnToast.setOnClickListener(btnToastClickListener)
        edtAlert = findViewById(R.id.edtAlert)
        customToastView = layoutInflater.inflate(R.layout.custom_toast, null );
        //var toast = Toast.makeText(applicationContext,"Toast Title",Toast.LENGTH_LONG)
       // toast.setGravity(Gravity.RIGHT,300,300)
       // toast.show()
    }

    val btnToastClickListener = View.OnClickListener {

       //Toast.makeText(this,edtAlert.text.toString(),Toast.LENGTH_LONG).show()
       var toast = CustomToast(this,edtAlert.text.toString()).createToast()
        toast.show()
    }
}