package com.example.firstfragments

data class User (val username: String, val password: String, var vitCaraCoroa: Int = 0, var derCaraCoroa: Int = 0,
var vitPedraPapelTesoura: Int = 0, var derPedraPapelTesoura: Int = 0, var vitBolinhaCopo: Int = 0, var derBolinhaCopo: Int = 0,
var empPedraPapelTesoura: Int = 0)