package com.practice.covid19api.pojos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Builder
@Document(collection = "dates")
@Getter
@Setter
public class Country {

    @Field("country/region")
    private String countryOrRegion;
    private int confirmed;
    private int recovered;
    private int deaths;

}
