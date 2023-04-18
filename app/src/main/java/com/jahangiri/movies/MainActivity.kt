import com.jahangiri.movies.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jahangiri.movies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //binding =>
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}