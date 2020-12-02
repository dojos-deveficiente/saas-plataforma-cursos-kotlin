package com.deveficiente.saascursoonline.compra

import java.math.BigDecimal

enum class TipoPlano(val valor: BigDecimal) {
    BASICO(BigDecimal(199.00)),
    POWER(BigDecimal(399.00)),
    EXPERT(BigDecimal(599.00))
}
