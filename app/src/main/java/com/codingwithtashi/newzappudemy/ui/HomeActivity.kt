package com.codingwithtashi.newzappudemy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.codingwithtashi.newzappudemy.R
import com.codingwithtashi.newzappudemy.util.CommonUtils

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun navigate(view: View) {
        when(view.id){
            R.id.business->{
                navigateToList(CommonUtils.BUSINESS)
            }
            R.id.computer->{
                navigateToList(CommonUtils.COMPUTER)
            }
            R.id.entertainment->{
                navigateToList(CommonUtils.ENTERTAINMENT)
            }
            R.id.general->{
                navigateToList(CommonUtils.GENERAL)
            }
            R.id.health->{
                navigateToList(CommonUtils.HEALTH)
            }
            R.id.fav->{
                navigateToList(CommonUtils.FAVOURITE)
            }
        }
    }

    private fun navigateToList(param: String) {
        intent  = Intent(this,NewsListActivity::class.java);
        intent.putExtra("param",param)
        startActivity(intent)
    }
}