package com.example.firstfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.firstfragments.databinding.FragmentCaraCoroaBinding
import com.example.firstfragments.databinding.FragmentPedraPapelTesouraBinding


class PedraPapelTesouraFragment: Fragment(R.layout.fragment_pedra_papel_tesoura) {

    private var _binding: FragmentPedraPapelTesouraBinding? = null
    private val binding get() = _binding!!

    //Acessar o que foi passado por parâmetro
    private val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPedraPapelTesouraBinding.inflate(inflater, container, false)
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

        binding.pedraButton.setOnClickListener {
            resultado = (1..3).random()
            binding.userImageView.setImageResource(R.drawable.pedra)

            if(resultado == 1){
                binding.oponentImageView.setImageResource(R.drawable.pedra)
                binding.pedraPapelTesouraTextView.setText("Empate!")
                Data.currentUser?.empPedraPapelTesoura = Data.currentUser?.empPedraPapelTesoura!! + 1
            }else if(resultado == 2){
                binding.oponentImageView.setImageResource(R.drawable.papel)
                binding.pedraPapelTesouraTextView.setText("Derrota!")
                Data.currentUser?.derPedraPapelTesoura = Data.currentUser?.derPedraPapelTesoura!! + 1
            }else{
                binding.oponentImageView.setImageResource(R.drawable.tesoura)
                binding.pedraPapelTesouraTextView.setText("Vitória!")
                Data.currentUser?.vitPedraPapelTesoura = Data.currentUser?.vitPedraPapelTesoura!! + 1
            }
        }

        binding.papelButton.setOnClickListener {
            resultado = (1..3).random()
            binding.userImageView.setImageResource(R.drawable.papel)

            if(resultado == 1){
                binding.oponentImageView.setImageResource(R.drawable.pedra)
                binding.pedraPapelTesouraTextView.setText("Vitória!")
                Data.currentUser?.vitPedraPapelTesoura = Data.currentUser?.vitPedraPapelTesoura!! + 1
            }else if(resultado == 2){
                binding.oponentImageView.setImageResource(R.drawable.papel)
                binding.pedraPapelTesouraTextView.setText("Empate!")
                Data.currentUser?.empPedraPapelTesoura = Data.currentUser?.empPedraPapelTesoura!! + 1
            }else{
                binding.oponentImageView.setImageResource(R.drawable.tesoura)
                binding.pedraPapelTesouraTextView.setText("Derrota!")
                Data.currentUser?.derPedraPapelTesoura = Data.currentUser?.derPedraPapelTesoura!! + 1
            }
        }

        binding.tesouraButton.setOnClickListener {
            resultado = (1..3).random()
            binding.userImageView.setImageResource(R.drawable.tesoura)

            if(resultado == 1){
                binding.oponentImageView.setImageResource(R.drawable.pedra)
                binding.pedraPapelTesouraTextView.setText("Derrota!")
                Data.currentUser?.derPedraPapelTesoura = Data.currentUser?.derPedraPapelTesoura!! + 1
            }else if(resultado == 2){
                binding.oponentImageView.setImageResource(R.drawable.papel)
                binding.pedraPapelTesouraTextView.setText("Vitória!")
                Data.currentUser?.vitPedraPapelTesoura = Data.currentUser?.vitPedraPapelTesoura!! + 1
            }else{
                binding.oponentImageView.setImageResource(R.drawable.tesoura)
                binding.pedraPapelTesouraTextView.setText("Empate!")
                Data.currentUser?.empPedraPapelTesoura = Data.currentUser?.empPedraPapelTesoura!! + 1
            }
        }

    }

}