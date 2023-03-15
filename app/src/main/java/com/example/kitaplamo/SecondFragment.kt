package com.example.kitaplamo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
//import androidx.navigation.fragment.findNavController
import com.example.kitaplamo.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)

//        _binding!!.textviewSecond.text="fdf"
        val view = inflater.inflate(R.layout.fragment_second , container, false)


        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?,) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.textview_second)
        val lamoId=requireArguments().getInt("lamoId").toString()
        textView.setText("\n\\n\\n\\n\\nn\n\\n\n\n\n\n\\n\\n\\n\n\\n\\n\\n\\n\\n\n\\n\no even its $lamoId")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}