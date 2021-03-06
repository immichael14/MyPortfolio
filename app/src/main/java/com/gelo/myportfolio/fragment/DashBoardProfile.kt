package com.gelo.myportfolio.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.gelo.myportfolio.R
import kotterknife.bindView

class DashBoardProfile : Fragment(), View.OnClickListener{


    private val profileImg: ImageView by bindView(R.id.profile_img)
    private val education : CardView by bindView(R.id.card_education)
    private val experience : CardView by bindView(R.id.card_experience)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_dashboard, container, false)
    }

    override fun onStart() {
        super.onStart()

        education.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.card_education -> addFragment(Education(), false, "education")
        }
    }

    fun addFragment(
        fragment: Fragment?,
        addToBackStack: Boolean,
        tag: String?
    ) {
        val manager = activity?.supportFragmentManager
        val ft = manager?.beginTransaction()
        if (addToBackStack) {
            ft?.addToBackStack(tag)
        }
        ft?.replace(R.id.fragment_container, fragment!!, tag)
        ft?.commitAllowingStateLoss()
    }
}