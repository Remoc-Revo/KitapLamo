package com.example.kitaplamo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kitaplamo.databinding.FragmentFirstBinding
import androidx.lifecycle.ViewModelProviders
import com.example.kitaplamo.SecondFragment
/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.okinyi.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment , Bundle().apply{ putInt("lamoId",0)})
        }

        binding.odhiambo.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply { putInt("lamoId",1) })
        }

        binding.odhiamboMoniang.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,Bundle().apply {putInt("lamoId",2)})
        }

        binding.batiso.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{putInt("lamoId",3)})
        }

        binding.batisoMantieKiawa.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,Bundle().apply { putInt("lamoId",4) } )
        }

        binding.batisoMaApoya.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",5)})
        }

        binding.katkaismManyien.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply { putInt("lamoId",6) })
        }
        binding.rwakoJiESawo.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply { putInt("lamoId",7) })
        }
        binding.yiewoLwedo.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",8)})
        }
        binding.pogoSawo.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",9)})
        }
        binding.kendMaler.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",10)})
        }
        binding.guedhoKend.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",11)})
        }
        binding.nuoyoKuongruokMarKend.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",12)})
        }
        binding.jumaKaJuma.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",13)})
        }
        binding.miseMarKanisa.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",14)})
        }
        binding.waloKanisa.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",15)})
        }
        binding.duokoKanisaETijeMamoko.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",16)})
        }
        binding.yiko.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",17)})
        }
        binding.yikMachielo.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",18)})
        }
        binding.yikoNgatModere.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",19)})
        }
        binding.rwakoJopuonjKanisa.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",20)})
        }
        binding.pwodhoGikLemoMogak.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",21)})
        }
        binding.rwakoJokristoMoaKaniseMamoko.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",22)})
        }
        binding.rwakoJokristoManeOa.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",23)})
        }
        binding.lokruokAERicho.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",24)})
        }
        binding.limoJotuo.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",25)})
        }
        binding.chang.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",26)})
        }
        binding.ndaloMoyiedhi.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",27)})
        }
        binding.mamoko.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",28)})
        }
        binding.erokamano.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",29)})
        }
        binding.erokamanoBangGimoroMotimore.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",30)})
        }
        binding.erokamanoBangKeyo.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",31)})
        }
        binding.erokamanoBangNyuol.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",32)})
        }
        binding.goyoErokamano.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, Bundle().apply{ putInt("lamoId",33)})
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}