package io.groovy.spring.validation

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    String coursePrefix

    @Override
    void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value()
    }

    @Override
    boolean isValid(String theCode,
                    ConstraintValidatorContext constraintValidatorContext) {

        boolean result

        if (theCode != null) {
            result = theCode.startsWith(coursePrefix)
        } else {
            result = true
        }
        return result
    }
}
