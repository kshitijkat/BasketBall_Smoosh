package com.example.smoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_leagueactivity.*
import model.Player

class leagueactivity : AppCompatActivity() {
    //var selected=""
    var player= Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagueactivity)
    }
    fun onmensClicked(view: View)
    {
        womenleaguebtn.isChecked=false;
        coedleaguebtn.isChecked=false;
        player.league="mens"
    }
    fun onwomenclicked(view: View)
    {
        coedleaguebtn.isChecked=false;
        mensLeagueBtn.isChecked=false;
        player.league="womens"

    }
    fun oncoedclicked(view: View)
    {
        womenleaguebtn.isChecked=false;
        mensLeagueBtn.isChecked=false;
        player.league="coed"
    }
    fun leagueNextClicked(view: View){
        if(player.league!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else
        {
            Toast.makeText(this,"Please Select a League" ,Toast.LENGTH_SHORT).show()
        }
    }

}


