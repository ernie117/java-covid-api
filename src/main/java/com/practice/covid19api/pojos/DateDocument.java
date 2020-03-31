package com.practice.covid19api.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

@Data
@Builder
@Document(collection = "dates")
@NoArgsConstructor
@AllArgsConstructor
public class DateDocument {

    public static final Comparator<DateDocument> BY_DATE
            = Comparator.comparing(DateDocument::getDate);

    @Id
    private String id;

    private LocalDate date;
    private List<Country> countries;

}
