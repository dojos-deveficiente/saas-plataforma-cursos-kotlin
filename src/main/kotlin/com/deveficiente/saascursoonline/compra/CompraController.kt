package com.deveficiente.saascursoonline.compra

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import javax.persistence.EntityManager
import javax.transaction.Transactional
import javax.validation.Valid

@RestController
class CompraController (val manager: EntityManager){

    @PostMapping("/compra")
    @Transactional
    fun compra(@RequestBody @Valid compraRequest: CompraRequest) : ResponseEntity<Void> {

        val compra: Compra = compraRequest.toModel()
        this.manager.persist(compra);

        val url = "http://gateway.paypal.com/payment?customId=${compra.codigo}&payment=${compra.tipoPlano.valor}"

        return ResponseEntity.created(URI.create(url)).build();
    }


}