package com.example.drwaing_tool

import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.drwaing_tool.PaintView.Companion.colorList
import com.example.drwaing_tool.PaintView.Companion.currentBrush
import com.example.drwaing_tool.PaintView.Companion.pathList
import com.example.drwaing_tool.ui.theme.Drwaing_ToolTheme

class MainActivity : ComponentActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initilise our btns
        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val erazer = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener{
            Toast.makeText(this, "Clicked1",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(android.graphics.Color.RED )
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener{
            Toast.makeText(this, "Clicked2",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(android.graphics.Color.BLUE)
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener{
            Toast.makeText(this, "Clicked3",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(android.graphics.Color.BLACK )
            currentColor(paintBrush.color)
        }
        erazer.setOnClickListener{
            Toast.makeText(this, "Clicked4",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()


        }
    }

    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }
}


