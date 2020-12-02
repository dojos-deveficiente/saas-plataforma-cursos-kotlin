package com.deveficiente.saascursoonline.compra

import java.time.LocalDate
import java.time.Period
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class IdadeValidator : ConstraintValidator<Idade, LocalDate> {

    private var idade: Int = 0

    override fun initialize(constraintAnnotation: Idade) {
        idade = constraintAnnotation.value
    }

    override fun isValid(value: LocalDate, context: ConstraintValidatorContext): Boolean {
        return Period.between(value, LocalDate.now()).years >= idade
    }

}
