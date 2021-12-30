package io.groovy.spring.model

import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size



class Customer {


    @NotNull(message="is required")
    @Size(min=1, message="is required")
    String firstName

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    String lastName

    @NotNull(message="is required")
    @Min(value=0L, message = "must be greater then or equal to zero")
    @Max(value=10L, message = "must be less then or equal to 10")
    Integer freePasses

    @Pattern(regexp = "^[a-zA-z0-0]{5}", message="only 5 chars/digits")
    String postalCode


}
