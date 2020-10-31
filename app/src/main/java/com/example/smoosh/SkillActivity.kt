

package com.example.smoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import model.Player


lateinit var player: Player

class SkillActivity : AppCompatActivity() {

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player=intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player= savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
    }

    fun onselectbeginner(view: View)
    {
       Baller_skill_btn.isChecked=false
        player.skill="beginner"
    }
    fun onselectballer(view: View)
    {
        Beginner_Skill_btn.isChecked=false
        player.skill="baller"
    }
    fun onskillfinish(view: View) = if(player.skill!="")
    {
        val finish=Intent(this,endscreen::class.java)
            finish.putExtra(EXTRA_PLAYER, player)
        startActivity(finish)
    }
    else
    {
        Toast.makeText(this, "Please Select a league", Toast.LENGTH_SHORT).show()
    }
}