package com.practice.covid19api.repos;

import com.practice.covid19api.pojos.DateDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface Covid19Repo extends MongoRepository<DateDocument, String> {

    List<DateDocument> findAll();

    DateDocument findByDate(LocalDate date);

}
