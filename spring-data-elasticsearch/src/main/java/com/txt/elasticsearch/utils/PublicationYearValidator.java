package com.txt.elasticsearch.utils;

import com.txt.elasticsearch.aspect.PublicationYear;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.Year;

public class PublicationYearValidator implements ConstraintValidator<PublicationYear, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return !Year.of(value).isAfter(Year.now());
    }
}