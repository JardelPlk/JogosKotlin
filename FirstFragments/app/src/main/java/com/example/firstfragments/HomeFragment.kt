package com.example.firstfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.firstfragments.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    //Acessar o que foi passado por parâmetro
    private val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.titleTextView.text = Data.currentUser?.username.toString()

        //Cara ou coroa
        binding.resultadoVitoriasTextView.text = Data.currentUser?.vitCaraCoroa.toString()
        binding.resultadoDerrotasTextView.text = Data.currentUser?.derCaraCoroa.toString()

        //Pedra papel ou tesoura
        binding.resultadoVitoriasPedraPapelTesouraTextView.text = Data.currentUser?.vitPedraPapelTesoura.toString()
        binding.resultadoDerrotasPedraPapelTesouraTextView.text = Data.currentUser?.derPedraPapelTesoura.toString()
        binding.resultadoEmpatesPedraPapelTesouraTextView.text = Data.currentUser?.empPedraPapelTesoura.toString()

        //Bolinha no copo
        binding.resultadoVitoriasBolinhaCopoTextView.text = Data.currentUser?.vitBolinhaCopo.toString()
        binding.resultadoDerrotasBolinhaCopoTextView.text = Data.currentUser?.derBolinhaCopo.toString()

        /*val loginButton = getView()?.findViewById<Button>(R.id.loginButton)
        loginButton?.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            findNavController().navigate(action)
        }*/

    }
}