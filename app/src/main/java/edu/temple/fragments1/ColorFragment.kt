package edu.temple.fragments1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class ColorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_color,container,false).apply{
            this.setOnClickListener{
                //Credit to https://stackoverflow.com/questions/5280367/android-generate-random-color-on-click for random color generation
                val newColor = (Math.random() * 16777215).toInt() or (0xFF shl 24)
                it.setBackgroundColor(newColor)
            }
        }
    }
}