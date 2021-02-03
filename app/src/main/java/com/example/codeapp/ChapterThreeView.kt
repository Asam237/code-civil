package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.barteksc.pdfviewer.PDFView

class ChapterThreeView : AppCompatActivity() {

    lateinit var pdfViewChapterThreeView: PDFView;
    lateinit var viewFirstHome: View;
    lateinit var viewFirstBack: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter_three_view)

        pdfViewChapterThreeView = findViewById(R.id.pdfViewChapterThreePanel)
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

        if(intent != null){
            val viewType = intent.getStringExtra("ViewType")
            if(viewType.equals("assets")){
                pdfViewChapterThreeView.fromAsset("tt3.pdf")
                    .onDrawAll { canvas, pageWidth, pageHeight, displayedPage ->  }
                    .onPageChange { page, pageCount ->  }
                    .defaultPage(0)
                    .password(null)
                    .enableSwipe(true)
                    .swipeHorizontal(true)
                    .load()
            }
        }
    }
}