package com.example.smoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_leagueactivity.*
import model.Player

class leagueactivity : AppCompatActivity() {
    //var selected=""
    var player= Player("","")
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagueactivity)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null)
            player= savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
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


