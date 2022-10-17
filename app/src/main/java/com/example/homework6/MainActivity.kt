package com.example.homework6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

// Comment from siam
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Create an object for the Adapter Class
        val myPagerAdapter = MyPageAdapter(this)
        vpager.adapter=myPagerAdapter
        // Will align the space according to the Screen size to equally spread
        tlayout.tabGravity=TabLayout.GRAVITY_FILL
        /* Setting up Tab Layout with the ViewPageg2 is handled by the TabLayoutMediator
              * by passing your tablayout id and viewpager id*/
        TabLayoutMediator(tlayout,vpager){tab,position->
            when(position){
                0->{
                    tab.text="Home"
                    tab.setIcon(R.drawable.home)
                }
                1->{
                    tab.text="About Me"
                    tab.setIcon(R.drawable.about)
                }
                2->{
                    tab.text="Work"
                    tab.setIcon(R.drawable.work)
                }
                3->{
                    tab.text = "Contact"
                    tab.setIcon(R.drawable.contact)
                }
            }
        }.attach()
    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.my_menu,menu)
        // Code to get the title and icon on the option overflow
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this,"Option clicked",Toast.LENGTH_LONG)
        when(item.itemId){
            R.id.facebook->{
                Toast.makeText(this,"Facebook clicked",Toast.LENGTH_LONG).show()
                return true;
            }
            R.id.telegram->{
                Toast.makeText(this,"telegram clicked",Toast.LENGTH_LONG).show()
                return true;
            }
            R.id.twitter->{
                Toast.makeText(this,"twitter clicked",Toast.LENGTH_LONG).show()
                return true;
            }
            R.id.linkedin->{
                Toast.makeText(this,"Linkedin clicked",Toast.LENGTH_LONG).show()
                return true;
            }
        }
        return super.onOptionsItemSelected(item)
    }
}