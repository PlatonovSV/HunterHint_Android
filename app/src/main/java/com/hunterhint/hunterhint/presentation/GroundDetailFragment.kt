package com.hunterhint.hunterhint.presentation

import android.os.Bundle
import com.hunterhint.hunterhint.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hunterhint.hunterhint.data.repository.GroundRep
import com.hunterhint.hunterhint.presentation.models.GroundTemp
import com.hunterhint.hunterhint.presentation.repository.IGroundRep


class GroundDetailFragment : Fragment() {
    private lateinit var groundTemp:GroundTemp

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val savedGround = savedInstanceState?.getSerializable("ground")
        if (savedGround is GroundTemp) {
            groundTemp = savedGround
        }
        return inflater.inflate(R.layout.fragment_ground_detail, container, false)
    }

    fun setGround(id:Int) {
        val groundRep:IGroundRep = GroundRep()
        this.groundTemp = groundRep.getGroundById(id)
    }

    override fun onStart() {
        super.onStart()
        if (!this::groundTemp.isInitialized) {

        }
        val view = view
        if (view != null) {
            val title = view.findViewById(R.id.textTitle) as TextView
            title.text = groundTemp.name
            val description = view.findViewById(R.id.textDescription) as TextView
            description.text =groundTemp.description
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable("ground", groundTemp)
    }

}