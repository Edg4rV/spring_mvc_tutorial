package io.groovy.spring.validation

import javax.validation.Constraint
import javax.validation.Payload
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
@interface CourseCode {

    String valuer() default "LUV"

    String message() default "must start with LUV"

    Class<?>[] groups default {}

    Class<? extends Payload>[] payload default {}

}