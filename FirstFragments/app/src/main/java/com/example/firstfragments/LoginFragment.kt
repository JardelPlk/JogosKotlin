package com.example.firstfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.firstfragments.databinding.FragmentLoginBinding

//Função para ir da tela loginFragment para welcomeFragment
class LoginFragment: Fragment(R.layout.fragment_login) {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.confirmButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            //Verificar se o usuário existe
            val user = Data.users.find { user -> user.username == username && user.password == password }

            var cont: Int = 0

            if(user == null) {
                Toast.makeText(context, "Usuário ou senha inválidos!", Toast.LENGTH_LONG).show()
            }else {
                Data.currentUser = user
                val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(username, password)
                findNavController().navigate(action)
            }

        }

        binding.cadastrarButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            if(username == "" || password == ""){
                Toast.makeText(context, "Digite um nome de usuário e uma senha!", Toast.LENGTH_LONG).show()
            }else{
                val user = User(username, password)
                Data.users.add(user)
                Toast.makeText(context, "Usuário cadastrado com sucesso!", Toast.LENGTH_LONG).show()
            }
        }

    }
}