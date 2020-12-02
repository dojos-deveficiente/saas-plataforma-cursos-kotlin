package com.deveficiente.saascursoonline.compra

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.persistence.EntityManager
import javax.validation.Valid

@RestController
class CompraController (val manager: EntityManager){



    @PostMapping("/compra")
    fun compra(@RequestBody @Valid compraRequest: CompraRequest) : ResponseEntity<Void> {

        val compra: Compra = compraRequest.toModel()
        this.manager.persist(compra);
        return ResponseEntity.ok().build();
    }


}