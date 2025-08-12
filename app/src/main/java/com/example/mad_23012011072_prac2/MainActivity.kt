package com.example.mad_23012011072_prac2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivty"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMessage("onCreate method called")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "showMessage: $msg")
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        showMessage("onStart method called")
        super.onStart()
        Snackbar.make(findViewById(R.id.main),"onStart method called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        showMessage("onResume method called")
        super.onResume()
    }

    override fun onPause() {
        showMessage("onPause method called")
        super.onPause()
    }

    override fun onStop() {
        showMessage("onStop method called")
        super.onStop()
    }

    override fun onDestroy() {
        showMessage("onDestroy method called")
        super.onDestroy()
    }

    override fun onRestart() {
        showMessage("onRestart method called")
        super.onRestart()
    }
}