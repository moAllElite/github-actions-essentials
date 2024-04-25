package com.groupeisi.githubactionsessentials.controllers;

import com.groupeisi.githubactionsessentials.dto.SentimentDTO;
import com.groupeisi.githubactionsessentials.services.ISentimentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RequestMapping(value = "/sentiments",produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class SentimentController {
    private  ISentimentService service;


    @GetMapping
    public List<SentimentDTO> getSentiments() {
        return  service.findAll();
    }

    @GetMapping("/{id}")
    public SentimentDTO getSentiment(@PathVariable Long id) {
        return  service.findById(id);
    }


    @PostMapping
    public void createSentiment(@RequestBody SentimentDTO sentimentDTO) {
        service.save(sentimentDTO);
    }

    @PutMapping("/{id}")
    public SentimentDTO updateSentiment(@PathVariable Long id,@RequestBody SentimentDTO sentimentDTO) {
        return service.update(id, sentimentDTO);
    }
}
