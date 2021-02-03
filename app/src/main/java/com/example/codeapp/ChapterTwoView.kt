package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.barteksc.pdfviewer.PDFView

class ChapterTwoView : AppCompatActivity() {

    lateinit var pdfVIewChapterTwoView: PDFView;
    lateinit var viewFirstBack: View;
    lateinit var viewFirstHome: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter_two_view)

        pdfVIewChapterTwoView = findViewById(R.id.pdfViewChapterTwoPanel)
        viewFirstHome = findViewById(R.id.viewFirstHome)
        viewFirstBack = findViewById(R.id.viewFirstBack)

        viewFirstBack.setOnClickListener {
            val intent = Intent(this, Penal::class.java)
            startActivity(intent)
        }
        viewFirstHome.setOnClickListener {
            val intentH = Intent(this, FirstHome::class.java)
            startActivity(intentH)
        }

        if(intent !=null){
            val viewType = intent.getStringExtra("ViewType")
            if(viewType.equals("assets")){
                pdfVIewChapterTwoView.fromAsset("tt2.pdf")
                    .password(null)
                    .enableSwipe(true)
                    .swipeHorizontal(true)
                    .defaultPage(0)
                    .onPageChange { page, pageCount ->  }
                    .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->  }
                    .load()
            }
        }

    }
}