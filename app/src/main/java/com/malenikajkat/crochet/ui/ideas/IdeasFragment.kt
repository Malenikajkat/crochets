package com.malenikajkat.crochet.ui.ideas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.malenikajkat.crochet.databinding.FragmentIdeasBinding


class IdeasFragment : Fragment() {

    private var _binding: FragmentIdeasBinding? = null

    // Это свойство действует только между onCreateView и
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ideasViewModel =
            ViewModelProvider(this).get(IdeasViewModel::class.java)

        _binding = FragmentIdeasBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textIdeas
        ideasViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}