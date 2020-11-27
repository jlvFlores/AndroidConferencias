package com.platzi.conf.view.ui.activities

//import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.platzi.conf.R

//import com.google.firebase.firestore.FirebaseFirestore
//import com.platzi.conf.model.Conference
//import com.platzi.conf.model.Speaker
//import org.json.JSONArray
//import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}