package com.deveficiente.saascursoonline.compra

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [IdadeValidator::class])
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class Idade(val value: Int, val message: String = "já existe este valor no banco de dados",
                       val groups: Array<KClass<Any>> = [],
                       val payload: Array<KClass<Payload>> = [])
