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
    @GetMapping("info")
    public ResponseEntity<String> show() {
        return ResponseEntity.ok("Hello World this is Mouhamed Niang the great !!!");
    }

    @GetMapping
    public ResponseEntity<List<SentimentDTO>> getSentiments() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SentimentDTO> getSentiment(@PathVariable Long id) {
        return  ResponseEntity.ok(service.findById(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createSentiment(@RequestBody SentimentDTO sentimentDTO) {
        service.save(sentimentDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SentimentDTO> updateSentiment(@PathVariable Long id,@RequestBody SentimentDTO sentimentDTO) {
        return ResponseEntity.ok(service.update(id, sentimentDTO));
    }
}
