package com.example.firstfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.firstfragments.databinding.FragmentCaraCoroaBinding


class CaraCoroaFragment: Fragment(R.layout.fragment_cara_coroa) {

    private var _binding: FragmentCaraCoroaBinding? = null
    private val binding get() = _binding!!

    //Acessar o que foi passado por parâmetro
    private val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCaraCoroaBinding.inflate(inflater, container, false)
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

        binding.caraButton.setOnClickListener{
            resultado = (1..2).random()

            if (resultado == 1){
                binding.caraCoroaImageView.setImageResource(R.drawable.cara)
                binding.caraCoroaTextView.setText("Vitória!")
                Data.currentUser?.vitCaraCoroa = Data.currentUser?.vitCaraCoroa!! + 1

            }else{
                binding.caraCoroaImageView.setImageResource(R.drawable.coroa)
                binding.caraCoroaTextView.setText("Derrota!")
                Data.currentUser?.derCaraCoroa = Data.currentUser?.derCaraCoroa!! + 1
            }
        }

        binding.coroaButton.setOnClickListener {
            resultado = (1..2).random()

            if (resultado == 2) {
                binding.caraCoroaImageView.setImageResource(R.drawable.coroa)
                binding.caraCoroaTextView.setText("Vitória!")
                Data.currentUser?.vitCaraCoroa = Data.currentUser?.vitCaraCoroa!! + 1
            }else{
                binding.caraCoroaImageView.setImageResource(R.drawable.cara)
                binding.caraCoroaTextView.setText("Derrota!")
                Data.currentUser?.derCaraCoroa = Data.currentUser?.derCaraCoroa!! + 1

            }
        }

    }

}