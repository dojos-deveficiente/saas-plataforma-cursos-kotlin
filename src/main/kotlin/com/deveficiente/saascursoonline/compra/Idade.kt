package com.deveficiente.saascursoonline.compra

import javax.validation.Payload
import kotlin.reflect.KClass

annotation class Idade(val value: Int, val message: String = "já existe este valor no banco de dados",
                       val groups: Array<KClass<Any>> = [],
                       val payload: Array<KClass<Payload>> = [])
