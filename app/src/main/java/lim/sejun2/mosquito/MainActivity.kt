package lim.sejun2.mosquito


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                supportFragmentManager.beginTransaction().add(MyDecorView(), "MyDecorView").addToBackStack(null).commit()
                supportFragmentManager.beginTransaction().replace(R.id.menu_container, MenuFragment()).addToBackStack(null).commit()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

}