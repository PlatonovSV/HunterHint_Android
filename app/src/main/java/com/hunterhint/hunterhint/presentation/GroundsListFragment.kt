package com.hunterhint.hunterhint.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.ListFragment

class GroundsListFragment: ListFragment() {
    fun onCreateView(
        inflater: LayoutInflater?, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater?.let { super.onCreateView(it, container, savedInstanceState) }
    }
}