package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class HomeActivity : AppCompatActivity() {

    lateinit var IvSetting : View;
    lateinit var IvHome : View;
    lateinit var clItemFirst: ConstraintLayout;
    lateinit var viewFirstHome: View;
    lateinit var lyCodeFirstFirst: LinearLayout;
    lateinit var lyCodeFirstSecund: LinearLayout;
    lateinit var lyCodeFirstFour: LinearLayout;
    lateinit var etHome:EditText;
    lateinit var ivGo:View;
    lateinit var lyCodeFirstThird: LinearLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        lyCodeFirstThird = findViewById(R.id.lyCodeFirstThird)
        etHome = findViewById(R.id.etHome)
        ivGo = findViewById(R.id.ivGo)
        viewFirstHome = findViewById(R.id.viewFirstHome);
        lyCodeFirstFirst = findViewById(R.id.lyCodeFirstFirst)
        lyCodeFirstSecund = findViewById(R.id.lyCodeFirstSecund)
        lyCodeFirstFour = findViewById(R.id.lyCodeFirstFour)

        lyCodeFirstThird.setOnClickListener {

            val intent = Intent(this, LivreTravail::class.java)
            startActivity(intent)
        }



//        val strUserName:String = etHome.text.toString();
//
//        if(TextUtils.isEmpty(strUserName)) {
//            etHome.setError("Your message");
//            return;
//        }

        ivGo.setOnClickListener {
            val message = etHome.text.toString();
            val intent = Intent(this, Dictionnaire::class.java)
            intent.putExtra("message_key01", message)
            startActivity(intent)
        }
        lyCodeFirstFour.setOnClickListener {
            val intent = Intent(this, LivreConstitution::class.java)
            startActivity(intent)
        }

        lyCodeFirstFirst.setOnClickListener {
            val intent = Intent(this, Livres::class.java)
            startActivity(intent)
        }

        lyCodeFirstSecund.setOnClickListener {
            val intent = Intent(this, LivreCivil::class.java)
            startActivity(intent)
        }

        viewFirstHome.setOnClickListener {
            val intent = Intent(this, FirstHome::class.java)
            startActivity(intent)
        }

//        IvHome = findViewById(R.id.ivHome);
//        IvSetting = findViewById(R.id.ivSetting);
//        clItemFirst = findViewById(R.id.clItemFirst)
//
//        IvSetting.setOnClickListener {
//            Toast.makeText(this, "Parametre !", Toast.LENGTH_LONG).show()
//        }
//
//        clItemFirst.setOnClickListener {
//            val intent = Intent(this, CodeCivil::class.java)
//            startActivity(intent)
//        }
//
//        IvHome.setOnClickListener {
//            val intent = Intent(this, FirstHome::class.java)
//            startActivity((intent))
//        }
//

    }
}