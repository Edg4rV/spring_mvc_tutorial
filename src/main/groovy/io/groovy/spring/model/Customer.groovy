package io.groovy.spring.model

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size



class Customer {


    @NotNull(message="is required")
    @Size(min=1, message="is required")
    String firstName

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    String lastName

}
