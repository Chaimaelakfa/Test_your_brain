import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test_your_brain.gamescreen

class StartScreen : AppCompatActivity() {

    companion object {
        const val routeName = "/start-game-screen"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            startGame(this)
        }
    }

    private fun startGame(context: Context) {
        val intent = Intent(context, gamescreen::class.java)
        startActivity(intent)
    }
}



