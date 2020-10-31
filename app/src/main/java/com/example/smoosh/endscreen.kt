package com.example.smoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_endscreen.*
import model.Player

class endscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_endscreen)
        val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        select_text.text="Looking For ${player.skill} ${player.league} League for you ..."
    }
}