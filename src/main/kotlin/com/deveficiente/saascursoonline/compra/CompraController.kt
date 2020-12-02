package com.deveficiente.saascursoonline.compra

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class CompraController {



    @PostMapping("/compra")
    fun compra(@RequestBody @Valid compraRequest: CompraRequest) : ResponseEntity<Void> {

        val compra: Compra = compraRequest.toModel()

        return ResponseEntity.ok().build();
    }


}