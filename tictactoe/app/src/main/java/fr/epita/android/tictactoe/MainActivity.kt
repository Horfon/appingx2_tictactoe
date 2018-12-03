package fr.epita.android.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.view.View
import fr.epita.android.tictactoe.R.layout.activity_game
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this@MainActivity)
    }

    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.button -> {
                    goToSecondActivity()
                }
                else -> {
                    Log.d("MainActivity", "onClick -> clicked on unknown button")
                }
            }
        }
        //button
    }
    private fun goToSecondActivity() {
        val explicitIntent = Intent(this, activity_game::class.java)
        val message = R.id.editText.toString()
        explicitIntent.putExtra("MESSAGE", message)
        startActivity(explicitIntent)
    }

}