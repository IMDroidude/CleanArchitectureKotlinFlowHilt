package com.example.cleanarchitecturekotlinflowhilt.ui.popular

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.cleanarchitecturekotlinflowhilt.R
import com.example.core_android.base.PBFragment

class PopularFragment : PBFragment(R.layout.fragment_movie_list) {
    private val mViewModel by viewModels<PopularViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        doInScope {

        }
    }
}