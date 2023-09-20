package com.example.splash_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.PopupMenu
import android.widget.Toast
import com.example.splash_screen.databinding.ActivityHomeBinding
import com.example.splash_screen.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.popup.setOnClickListener {
            val popupMenu = PopupMenu(this@HomeActivity, binding.popup)
            popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { it ->
                Toast.makeText(this@HomeActivity, "You clicked : " + it.title, Toast.LENGTH_SHORT)
                    .show()

                true
            }
            popupMenu.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}

