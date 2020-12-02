package com.deveficiente.saascursoonline.compra

import org.springframework.util.StringUtils
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class DocumentoValidator : ConstraintValidator<Documento, String> {

	override fun isValid(value: String, context: ConstraintValidatorContext): Boolean {
		if (!StringUtils.hasText(value)) {
			return true
		}


	}

}
