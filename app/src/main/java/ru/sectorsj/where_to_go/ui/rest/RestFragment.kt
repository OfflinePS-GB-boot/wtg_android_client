package ru.sectorsj.where_to_go.ui.rest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.sectorsj.where_to_go.R
import ru.sectorsj.where_to_go.databinding.FragmentRestBinding

class RestFragment : Fragment() {

    lateinit var binding: FragmentRestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRestBinding.inflate(inflater, container, false)
        return binding.root
    }

}