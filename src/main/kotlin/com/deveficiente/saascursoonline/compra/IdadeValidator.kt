package com.deveficiente.saascursoonline.compra

import java.time.LocalDate
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class IdadeValidator : ConstraintValidator<Idade, LocalDate > {

    private var idade: Int = 0

    override fun initialize(constraintAnnotation: Idade) {
        idade = constraintAnnotation.value
    }

    override fun isValid(value: LocalDate, context: ConstraintValidatorContext?): Boolean {


    }

}
