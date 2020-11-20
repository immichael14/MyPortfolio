package com.gelo.myportfolio.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.gelo.myportfolio.R
import kotterknife.bindView

class Education : Fragment(), View.OnClickListener{

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
        return inflater.inflate(R.layout.layout_education, container, false)
    }

    override fun onStart() {
        super.onStart()
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