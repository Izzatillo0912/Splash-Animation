package com.example.animationar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animZoomOutView =  AnimationUtils.loadAnimation(this, R.anim.anim_zoom_out_view)
        stick.startAnimation(animZoomOutView)

        stick.visibility = View.VISIBLE
        val animZoomInView =  AnimationUtils.loadAnimation(this, R.anim.anim_zoom_in_view)
        stick.startAnimation(animZoomInView)

        Handler().postDelayed(
            {
                frame_one.visibility = View.VISIBLE
                val txtAREducationAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha_areducation)
                txt_A.startAnimation(txtAREducationAlpha)
                txt_education.startAnimation(txtAREducationAlpha)
            }, 1000
        )
        Handler().postDelayed(
            {
                frame_logo.visibility = View.VISIBLE
                val animLogo = AnimationUtils.loadAnimation(this, R.anim.anim_logo)
                img_logo.startAnimation(animLogo)
            }, 2000
        )
        Handler().postDelayed(
            {
                txt_line1_c.visibility = View.VISIBLE
            }, 3000
        )
        Handler().postDelayed(
            {
                txt_line1_o.visibility = View.VISIBLE
            }, 3300
        )
        Handler().postDelayed(
            {
                txt_line1_m.visibility = View.VISIBLE
            }, 3600
        )
        Handler().postDelayed(
            {
                txt_line1_p.visibility = View.VISIBLE
            }, 3900
        )
        Handler().postDelayed(
            {
                txt_line1_a.visibility = View.VISIBLE
            }, 4200
        )
        Handler().postDelayed(
            {
                txt_line1_n.visibility = View.VISIBLE
            }, 4500
        )
        Handler().postDelayed(
            {
                txt_line1_y.visibility = View.VISIBLE
            }, 4800
        )
        Handler().postDelayed(
            {
                txt_line2_a.visibility = View.VISIBLE
            }, 5100
        )
        Handler().postDelayed(
            {
                txt_line2_r.visibility = View.VISIBLE
            }, 5400
        )
        Handler().postDelayed(
            {
                txt_line2_f.visibility = View.VISIBLE
            }, 5700
        )
        Handler().postDelayed(
            {
                txt_line2_o.visibility = View.VISIBLE
            }, 6000
        )
        Handler().postDelayed(
            {
                txt_line2_m.visibility = View.VISIBLE
            }, 6300
        )
        Handler().postDelayed(
            {
                txt_line2_2a.visibility = View.VISIBLE
            }, 6600
        )
        Handler().postDelayed(
            {
                txt_line2_x.visibility = View.VISIBLE
            }, 6900
        )
    }
}