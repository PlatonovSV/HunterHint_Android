package com.hunterhint.hunterhint.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.ListFragment
import com.hunterhint.hunterhint.R
import com.hunterhint.hunterhint.presentation.adapters.GroundListAdapter
import com.hunterhint.hunterhint.presentation.models.GroundTemp


class GroundsListFragment : ListFragment() {
    internal interface Listener {
        fun itemClicked(id: Long)
    }

    private lateinit var listener: Listener

    override fun onAttach(context:Context) {
        super.onAttach(context)
        listener = context as Listener
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val names = ArrayList<String>();
        for (ground in GroundTemp.groundTemps) {
            names.add(ground.name)
        }
        val adapter = GroundListAdapter(inflater.context, R.layout.list_item, GroundTemp.groundTemps)
        listAdapter = adapter
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onListItemClick(listView: ListView, itemView: View, position: Int, id: Long) {
        if (listener != null) {
            listener.itemClicked(id)
        }
    }

}



