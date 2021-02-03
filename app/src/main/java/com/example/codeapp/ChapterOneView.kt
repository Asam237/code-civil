package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.barteksc.pdfviewer.PDFView

class ChapterOneView : AppCompatActivity() {

    lateinit var pdfViewChapterOne : PDFView;
    lateinit var viewFirstHome: View;
    lateinit var viewFirstBack: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter_one_view)

        viewFirstBack = findViewById(R.id.viewFirstBack);
        pdfViewChapterOne = findViewById(R.id.pdfViewChapterOnePanel);
        viewFirstHome = findViewById(R.id.viewFirstHome)

        viewFirstHome.setOnClickListener {
            val intentH = Intent(this, FirstHome::class.java)
            startActivity(intentH)
        }

        viewFirstBack.setOnClickListener {
            val intent = Intent(this, Penal::class.java)
            startActivity(intent)
        }

        if(intent != null){
            val viewType = intent.getStringExtra("ViewType")
            if(viewType.equals("assets")){
                pdfViewChapterOne.fromAsset("tt1.pdf")
                    .password("null")
                    .enableSwipe(true)
                    .defaultPage(12)
                    .enableAnnotationRendering(true)
                    .onPageChange { page, pageCount ->  }
                    .onPageScroll { page, positionOffset ->  }
                    .swipeHorizontal(true)
                        .spacing(20)
                    .load()
                    
            }
        }

    }
}