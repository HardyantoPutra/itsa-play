package com.smuxitsa.MainApplication.controller;


import com.smuxitsa.MainApplication.MainApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class TransactionController {

    private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

    public ResponseEntity<String> retrieveTransactions() throws URISyntaxException {
        log.info("Pulling data");
        final String url = "http://localhost:8095/transactions/";

        RestTemplate restTemplate = new RestTemplate();

        URI uri = new URI(url);

        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        return result;
    }

    @RequestMapping(value = "/transactions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<String> test() throws URISyntaxException {

        return retrieveTransactions();
    }


}
