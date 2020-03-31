package com.practice.covid19api.controllers;

import com.practice.covid19api.config.ConfigProperties;
import com.practice.covid19api.pojos.DateDocument;
import com.practice.covid19api.services.DatesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseStatus(HttpStatus.OK)
@Api(tags = {"Fetch all Dates"})
public class ReturnAllDatesController {

    private DatesService datesService;
    private ConfigProperties configProperties;

    @Autowired
    public ReturnAllDatesController(DatesService datesService, ConfigProperties configProperties) {
        this.datesService = datesService;
        this.configProperties = configProperties;
    }

    @GetMapping(value = "/v1/allDates")
    public ResponseEntity<List<DateDocument>> fetchAllDateDocuments() {
        return datesService.getAllDates()
                .map(dates ->
                    ResponseEntity
                            .ok()
                            .body(dates)
                ).orElse(ResponseEntity.noContent().build());
    }
}
