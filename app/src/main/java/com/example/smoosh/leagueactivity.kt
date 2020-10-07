package com.example.smoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_leagueactivity.*

class leagueactivity : AppCompatActivity() {
    var Selected=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagueactivity)
    }
    fun onmensClicked(view: View)
    {
        womenleaguebtn.isChecked=false;
        coedleaguebtn.isChecked=false;
        Selected="mens"
    }
    fun onwomenclicked(view: View)
    {
        coedleaguebtn.isChecked=false;
        mensLeagueBtn.isChecked=false;
        Selected="womens"

    }
    fun oncoedclicked(view: View)
    {
        womenleaguebtn.isChecked=false;
        mensLeagueBtn.isChecked=false;
        Selected="coed"
    }
    fun leagueNextClicked(view: View){
        if(Selected!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,Selected)
            startActivity(skillActivity)
        }else
        {
            Toast.makeText(this,"Please Select a League" ,Toast.LENGTH_SHORT).show()
        }
    }

}