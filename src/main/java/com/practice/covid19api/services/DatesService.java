package com.practice.covid19api.services;

import com.practice.covid19api.pojos.DateDocument;
import com.practice.covid19api.repos.Covid19Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DatesService {

    private final Covid19Repo covid19Repo;

    @Autowired
    public DatesService(Covid19Repo covid19Repo) {
        this.covid19Repo = covid19Repo;
    }

    public Optional<List<DateDocument>> getAllDates() {
        return Optional.of(
                Collections.unmodifiableList(
                        covid19Repo.findAll()
                                .stream()
                                .sorted(DateDocument.BY_DATE)
                                .collect(Collectors.toList())
                )
        );
    }
}
