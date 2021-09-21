package com.example.navcontrol_contactappassignment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.navcontrol_contactappassignment.R


class DetailFragment : Fragment() {
    private lateinit var changeNumbers:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val playerImage: ImageView = view.findViewById(R.id.ivImage2s)
        changeNumbers = view.findViewById(R.id.textView2)
        val playerName = view.findViewById<TextView>(R.id.textView)
        val images = arguments?.getInt("image")
        playerName.text = arguments?.getString("name")

        if (images != null){
            playerImage.setImageResource(images)
        }




    }
}