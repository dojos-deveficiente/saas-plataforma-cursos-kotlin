package com.deveficiente.saascursoonline.compra

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CompraController {

    @PostMapping("/compra")
    fun compra( compraRequest: CompraRequest) : ResponseEntity<Void> {
        return ResponseEntity.ok().build();
    }


}