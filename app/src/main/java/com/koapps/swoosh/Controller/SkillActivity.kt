package com.koapps.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.koapps.swoosh.Utilities.EXTRA_LEAGUE
import com.koapps.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)




    }

    fun onFinishClick(view: View) {
        val finishActivity = Intent(this, FinishActivity::class.java)
        startActivity(finishActivity)
    }
}