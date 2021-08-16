package com.example.firstfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import com.example.firstfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Acessar as activities com o binding
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Acessar os componentes da main através do binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Para adicionar a nossa toolbar
        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()

        //Telas que não terão botão de retorno
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homeFragment, R.id.loginFragment),
            binding.drawerLayout
        )

        setSupportActionBar(binding.toolbar)
        setupActionBarWithNavController(navController, appBarConfiguration)

        //Acessar a barra inferior
        //binding.bottomNav.setupWithNavController(navController)

        //Acessar o menu do lado
        binding.navView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    //Para o menu aparecer
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if(item.itemId == R.id.settingsFragment)
            item.onNavDestinationSelected(navController) ||
                    super.onOptionsItemSelected(item)//Caso não seja igual a clase super da um jeito
        else if(item.itemId == R.id.termsFragment){
            val action = NavGrafhDirections.actionGlobalTermsFragment()
            navController.navigate(action)
            //O útimo comnado dentro do if ou else é o que vai ser retornado
            true
        }else
            false
    }

}