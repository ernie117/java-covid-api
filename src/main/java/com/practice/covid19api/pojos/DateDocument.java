package com.practice.covid19api.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
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
    private ObjectId id;

    private LocalDateTime date;
    private List<Country> countries;

}
