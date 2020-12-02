package com.deveficiente.saascursoonline.compra

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [DocumentoValidator::class])
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class Documento(val message: String = "",
                       val groups: Array<KClass<Any>> = [],
                       val payload: Array<KClass<Payload>> = [])