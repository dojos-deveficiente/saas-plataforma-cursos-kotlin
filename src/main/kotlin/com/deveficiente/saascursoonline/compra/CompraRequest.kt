package com.deveficiente.saascursoonline.compra

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class CompraRequest(
        @field: NotBlank
        val nome: String,

        @field: NotBlank
        @field: Email
        val email: String,

        @field: NotNull
        @field: Idade(18)
        @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
        val dataNascimento: LocalDate,

        @field: NotBlank
        val celular: String,

        @field: NotBlank
        val nomeNf: String,

        @field: NotBlank
        @field: Documento
        val documento: String,

        @field: NotBlank
        val endereco: String,

        @field: NotBlank
        val bairro: String,

        @field: NotBlank
        val numero: String,

        @field: NotBlank
        val estado: String,

        @field: NotBlank
        val cidade: String,
        @field: NotNull
        val tipoPlano: TipoPlano
) {
        fun toModel(): Compra {
                return Compra(nome, email, dataNascimento )

        }

}
