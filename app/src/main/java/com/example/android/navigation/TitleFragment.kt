package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        /*
        * DataBindingUtil : Utility class to create ViewDataBinding from layouts
        */

        /* inflate method documentation
         * @Param1 : inflater – The LayoutInflater used to inflate the binding layout.
         * @Param2 : layoutId – The layout resource ID of the layout to inflate.
         * @Param3 : parent – Optional view to be the parent of the generated hierarchy (if attachToParent is true), or else simply an object that provides a set of LayoutParams values for root of the returned hierarchy (if attachToParent is false.)
         * @Param4 : attachToParent – Whether the inflated hierarchy should be attached to the parent parameter. If false, parent is only used to create the correct subclass of LayoutParams for the root view in the XML.
         */

        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        return binding.root
    }

}