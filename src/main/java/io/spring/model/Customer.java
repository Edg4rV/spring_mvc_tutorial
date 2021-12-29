package io.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    String firstName;

    @NotNull
    @Size(min=1, message="is required")
    String lastName;

}
