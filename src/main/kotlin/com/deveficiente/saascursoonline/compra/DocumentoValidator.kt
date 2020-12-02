package com.deveficiente.saascursoonline.compra

import org.hibernate.validator.internal.constraintvalidators.hv.br.CNPJValidator
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator
import org.springframework.util.StringUtils
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class DocumentoValidator : ConstraintValidator<Documento, String> {

	override fun isValid(value: String, context: ConstraintValidatorContext): Boolean {
		if (!StringUtils.hasText(value)) {
			return true
		}

		val cpfValidator = CPFValidator()
		val cnpjValidator = CNPJValidator()

		cpfValidator.initialize(null)
		cnpjValidator.initialize(null)

		return cpfValidator.isValid(value, context) || cnpjValidator.isValid(value, context)
	}

}
