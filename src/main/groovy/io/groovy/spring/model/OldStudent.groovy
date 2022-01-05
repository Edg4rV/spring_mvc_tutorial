package io.groovy.spring.model

import groovy.transform.Canonical

@Canonical
class OldStudent {

    String firstName
    String lastName
    String country
    String favoriteLanguage
    String[] operatingSystem

    LinkedHashMap<String, String> countryOptions

    OldStudent() {
        countryOptions = new LinkedHashMap<>()
        countryOptions.put("ARM", "Armenia")
        countryOptions.put("FR", "France")
        countryOptions.put("GEO", "Georgia")
        countryOptions.put("JSM", "Jerusalim")
        countryOptions.put("RUS", "Russia")
    }




}
