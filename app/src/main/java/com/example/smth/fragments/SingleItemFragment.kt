package com.example.smth.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.smth.R
import com.example.smth.fragments.SingleItemFragmentArgs.Companion.fromBundle
import com.example.smth.retrofit.image_url
import kotlinx.android.synthetic.main.single_item.*
import kotlinx.android.synthetic.main.single_item.tv_rating
import kotlinx.android.synthetic.main.single_item.tv_title
import kotlinx.android.synthetic.main.single_item_fragment.*

class SingleItemFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.single_item_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val movie by lazy {
            fromBundle(requireArguments()).movie
        }
        tv_title.text = movie.title
        tv_rating.text = movie.vote_average.toString()
        tv_overview.text = movie.overview

        Glide.with(view.context).load(image_url + movie.poster_path).into(view.findViewById(R.id.iv_movie_photo_fragment))
    }
}