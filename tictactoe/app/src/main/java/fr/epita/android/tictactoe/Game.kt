package fr.epita.android.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_game.*

class Game : AppCompatActivity(), View.OnClickListener  {

    var turn = "Player"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        button2.setOnClickListener(this@Game)
        button3.setOnClickListener(this@Game)
        button4.setOnClickListener(this@Game)
        button5.setOnClickListener(this@Game)
        button6.setOnClickListener(this@Game)
        button7.setOnClickListener(this@Game)
        button8.setOnClickListener(this@Game)
        button9.setOnClickListener(this@Game)
        button10.setOnClickListener(this@Game)

        val originIntent = intent
        val message = originIntent.getStringExtra("MESSAGE")
        
    }

    override fun onClick(clickedView: View?) {

        val buttontopleft = findViewById<Button>(R.id.button2)
        val buttontopmiddle = findViewById<Button>(R.id.button3)
        val buttontopright = findViewById<Button>(R.id.button4)

        val buttonmiddleleft = findViewById<Button>(R.id.button5)
        val buttonmiddle = findViewById<Button>(R.id.button6)
        val buttonmiddleright = findViewById<Button>(R.id.button7)

        val buttonbotleft = findViewById<Button>(R.id.button8)
        val buttonbot = findViewById<Button>(R.id.button9)
        val buttonbotright = findViewById<Button>(R.id.button10)

        if (clickedView != null) {

            when (clickedView.id) {
                R.id.button2 ->{
                    if (turn == "player")
                    {
                        buttontopleft.text = "X"
                        turn = "p2"
                    }
                    else
                    {
                        buttontopleft.text = "O"
                        turn = "player"
                    }
                }
                R.id.button3 ->{
                    if (turn == "player")
                    {
                        buttontopmiddle.text = "X"
                        turn = "p2"
                    }
                    else
                    {
                        buttontopmiddle.text = "O"
                        turn = "player"
                    }

                }
                R.id.button4 ->{
                    if (turn == "player")
                    {
                        buttontopright.text = "X"
                        turn = "p2"
                    }
                    else
                    {
                        buttontopright.text = "O"
                        turn = "player"
                    }
                }
                R.id.button5 ->{
                    if (turn == "player")
                    {
                        turn = "p2"
                        buttonmiddleleft.text = "X"
                    }
                    else
                    {
                        buttonmiddleleft.text = "O"
                        turn = "player"
                    }
                }
                R.id.button6->{
                    if (turn == "player")
                    {
                        buttonmiddle.text = "X"
                        turn = "p2"
                    }
                    else
                    {
                        buttonmiddle.text = "O"
                        turn = "player"
                    }
                }
                R.id.button7 ->{
                    if (turn == "player")
                    {
                        turn = "p2"
                        buttonmiddleright.text = "X"
                    }
                    else
                    {
                        buttonmiddleright.text = "O"
                        turn = "player"
                    }
                }
                R.id.button8 ->{
                    if (turn == "player")
                    {
                        turn = "p2"
                        buttonbotleft.text = "X"
                    }
                    else
                    {
                        buttonbotleft.text = "O"
                        turn = "player"
                    }
                }
                R.id.button9 ->{
                    if (turn == "player")
                    {
                        turn = "p2"
                        buttonbot.text = "X"
                    }
                    else
                    {
                        buttonbot.text = "O"
                        turn = "player"
                    }
                }
                R.id.button10 ->{
                    if (turn == "player") {
                        buttonbotright.text = "X"
                        turn = "p2"
                    }
                    else
                    {
                        buttonbotright.text = "O"
                        turn = "player"
                    }
                }
                else -> {
                    Log.d("MainActivity", "onClick -> clicked on unknown button")
                }
            }
        }
    }
}
