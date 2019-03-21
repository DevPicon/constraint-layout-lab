package pe.devpicon.android.myconstraintlayoutlabapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToSteroidRelativeLayout(view: View) {
        startActivity(Intent(this@MainActivity, SteroidRelativeLayoutActivity::class.java))
    }

    fun goToDemo1(view: View) {
        startActivity(Intent(this@MainActivity, Demo1Activity::class.java))
    }
}
