package com.nmp.anmpb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.nmp.anmpb.databinding.FragmentOptionBinding

class OptionFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentOptionBinding? = null
    private val binding get() = _binding!!

    private val LEVEL = arrayOf("Easy", "Medium", "Hard")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            LEVEL
        )
        binding.txtLevel.setAdapter(adapter)
        binding.txtLevel.setText(LEVEL[0], false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}