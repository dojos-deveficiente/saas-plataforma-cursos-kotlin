package com.deveficiente.saascursoonline.compra

import java.time.Instant
import java.time.LocalDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
@Entity
class Compra(
        val nome: String,
        val email: String,
        val dataNascimento: LocalDate,
        val celular: String,
        val nomeNf: String,
        val documento: String,
        val endereco: String,
        val bairro: String,
        val numero: String,
        val estado: String,
        val cidade: String,
        val tipoPlano: TipoPlano

) {
   @Id
   val codigo: UUID = UUID.randomUUID()
   val instanteCriacao: Instant = Instant.now()

}
