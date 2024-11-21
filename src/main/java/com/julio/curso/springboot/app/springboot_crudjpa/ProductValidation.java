package com.julio.curso.springboot.app.springboot_crudjpa;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.julio.curso.springboot.app.springboot_crudjpa.models.Product;

@Component
public class ProductValidation implements Validator{

    @SuppressWarnings("null")
    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @SuppressWarnings("null")
    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "es requerido");
        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotBlank.product.description");
        if (product.getDescription() == null || product.getDescription().isBlank()) {
            errors.rejectValue("description", null, "es requerido");
        }

        if (product.getPrice() == null) {
            errors.rejectValue("price", null, "No puede estar vacio");
        } else if (product.getPrice() < 500) {
            errors.rejectValue("price", null, "Debe ser superior a 500");
        }
    }

}
