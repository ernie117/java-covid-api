package com.practice.covid19api.controllers;

import com.practice.covid19api.config.ConfigProperties;
import com.practice.covid19api.pojos.DateDocument;
import com.practice.covid19api.services.DatesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ResponseStatus(HttpStatus.OK)
@Api(tags = {"Find by date"})
public class FindDateDocumentByDate {

    private DatesService datesService;
    private ConfigProperties configProperties;

    @Autowired

    public FindDateDocumentByDate(DatesService datesService, ConfigProperties configProperties) {
        this.datesService = datesService;
        this.configProperties = configProperties;
    }

    @GetMapping(value = "/v1/findByDate")
    public ResponseEntity<DateDocument> findByDate(@RequestParam("date")
                                                   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date localDate) {
        return datesService.getDocumentByDate(localDate)
                .map(dateDocument ->
                        ResponseEntity
                                .ok()
                                .body(dateDocument)
                ).orElse(ResponseEntity.noContent().build());
    }
}
