package com.busayo.ecommercebackend.validator;

import com.busayo.ecommercebackend.annotation.CouponTypeAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;


public class CouponTypeValidator implements ConstraintValidator<CouponTypeAnnotation, CharSequence> {

    private List<String> acceptedValues = new ArrayList<>();

    @Override
    public void initialize(CouponTypeAnnotation annotation) {
        for (Enum<?> enumValue : annotation.enumClass().getEnumConstants()) {
            acceptedValues.add(enumValue.toString());
        }
    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        return acceptedValues.contains(value.toString().toUpperCase());
    }
}

