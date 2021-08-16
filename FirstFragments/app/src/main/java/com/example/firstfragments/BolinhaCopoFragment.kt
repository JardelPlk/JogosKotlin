package com.example.firstfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.firstfragments.databinding.FragmentBolinhaCopoBinding
import com.example.firstfragments.databinding.FragmentCaraCoroaBinding
import com.example.firstfragments.databinding.FragmentPedraPapelTesouraBinding


class BolinhaCopoFragment: Fragment(R.layout.fragment_bolinha_copo) {

    private var _binding: FragmentBolinhaCopoBinding? = null
    private val binding get() = _binding!!

    //Acessar o que foi passado por parâmetro
    private val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBolinhaCopoBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var resultado = 0

        binding.copo1Button.setOnClickListener {
            resultado = (1..3).random()

            if(resultado == 1){
                binding.copo1ImageView.setImageResource(R.drawable.bolinha)
                binding.copo2ImageView.setImageResource(R.drawable.copo)
                binding.copo3ImageView.setImageResource(R.drawable.copo)
                binding.bolinhaCopoTextView.setText("Vitória!")
                Data.currentUser?.vitBolinhaCopo = Data.currentUser?.vitBolinhaCopo!! + 1
            }else if(resultado == 2){
                binding.copo1ImageView.setImageResource(R.drawable.copo)
                binding.copo2ImageView.setImageResource(R.drawable.bolinha)
                binding.copo3ImageView.setImageResource(R.drawable.copo)
                binding.bolinhaCopoTextView.setText("Derrota!")
                Data.currentUser?.derBolinhaCopo = Data.currentUser?.derBolinhaCopo!! + 1
            }else{
                binding.copo1ImageView.setImageResource(R.drawable.copo)
                binding.copo2ImageView.setImageResource(R.drawable.copo)
                binding.copo3ImageView.setImageResource(R.drawable.bolinha)
                binding.bolinhaCopoTextView.setText("Derrota!")
                Data.currentUser?.derBolinhaCopo = Data.currentUser?.derBolinhaCopo!! + 1
            }
        }

        binding.copo2Button.setOnClickListener {
            resultado = (1..3).random()

            if(resultado == 1){
                binding.copo1ImageView.setImageResource(R.drawable.bolinha)
                binding.copo2ImageView.setImageResource(R.drawable.copo)
                binding.copo3ImageView.setImageResource(R.drawable.copo)
                binding.bolinhaCopoTextView.setText("Derrota!")
                Data.currentUser?.derBolinhaCopo = Data.currentUser?.derBolinhaCopo!! + 1
            }else if(resultado == 2){
                binding.copo1ImageView.setImageResource(R.drawable.copo)
                binding.copo2ImageView.setImageResource(R.drawable.bolinha)
                binding.copo3ImageView.setImageResource(R.drawable.copo)
                binding.bolinhaCopoTextView.setText("Vitória!")
                Data.currentUser?.vitBolinhaCopo = Data.currentUser?.vitBolinhaCopo!! + 1
            }else{
                binding.copo1ImageView.setImageResource(R.drawable.copo)
                binding.copo2ImageView.setImageResource(R.drawable.copo)
                binding.copo3ImageView.setImageResource(R.drawable.bolinha)
                binding.bolinhaCopoTextView.setText("Derrota!")
                Data.currentUser?.derBolinhaCopo = Data.currentUser?.derBolinhaCopo!! + 1
            }
        }

        binding.copo3Button.setOnClickListener {
            resultado = (1..3).random()

            if(resultado == 1){
                binding.copo1ImageView.setImageResource(R.drawable.bolinha)
                binding.copo2ImageView.setImageResource(R.drawable.copo)
                binding.copo3ImageView.setImageResource(R.drawable.copo)
                binding.bolinhaCopoTextView.setText("Derrota!")
                Data.currentUser?.derBolinhaCopo = Data.currentUser?.derBolinhaCopo!! + 1
            }else if(resultado == 2){
                binding.copo1ImageView.setImageResource(R.drawable.copo)
                binding.copo2ImageView.setImageResource(R.drawable.bolinha)
                binding.copo3ImageView.setImageResource(R.drawable.copo)
                binding.bolinhaCopoTextView.setText("Derrota!")
                Data.currentUser?.derBolinhaCopo = Data.currentUser?.derBolinhaCopo!! + 1
            }else{
                binding.copo1ImageView.setImageResource(R.drawable.copo)
                binding.copo2ImageView.setImageResource(R.drawable.copo)
                binding.copo3ImageView.setImageResource(R.drawable.bolinha)
                binding.bolinhaCopoTextView.setText("Vitória!")
                Data.currentUser?.vitBolinhaCopo = Data.currentUser?.vitBolinhaCopo!! + 1
            }
        }


    }

}