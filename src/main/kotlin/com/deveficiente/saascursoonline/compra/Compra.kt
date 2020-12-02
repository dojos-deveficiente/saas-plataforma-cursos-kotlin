package com.deveficiente.saascursoonline.compra

import java.time.Instant
import java.time.LocalDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
@Entity
class Compra(
        nome: String,
        email: String,
        dataNascimento: LocalDate,
        celular: String,
        nomeNf: String,
        documento: String,
        endereco: String,
        bairro: String,
        numero: String,
        estado: String,
        cidade: String,
        tipoPlano: TipoPlano

) {
   @Id
   val  codigo: UUID = UUID.randomUUID()
   val  instanteCriacao: Instant = Instant.now()

}
