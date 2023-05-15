import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.welcome_page.*

class WelcomePage : AppCompatActivity() {

    companion object {
        const val routeName = "/welcome-page-screen"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_page)

        nextButton.setOnClickListener {
            nextScreen(this)
        }
    }

    private fun nextScreen(context: Context) {
        val intent = Intent(context, StartScreen::class.java)
        startActivity(intent)
    }
}
