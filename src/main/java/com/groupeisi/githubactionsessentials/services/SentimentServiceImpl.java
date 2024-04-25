package com.groupeisi.githubactionsessentials.services;

import com.groupeisi.githubactionsessentials.dao.SentimentRepository;
import com.groupeisi.githubactionsessentials.dto.SentimentDTO;
import com.groupeisi.githubactionsessentials.entities.Sentiment;
import com.groupeisi.githubactionsessentials.mapper.ISentimentMapper;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Transactional
public class SentimentServiceImpl implements ISentimentService {

    private SentimentRepository sentimentRepository;

    private final ISentimentMapper mapper;

    @Override
    public void save(SentimentDTO sentimentDTO) {
        Sentiment sentiment = mapper.toSentiment(sentimentDTO);
        sentimentRepository.save(sentiment);
    }

    @Override
    public SentimentDTO findById(Long id) {
        return mapper.toSentimentDTO(
                sentimentRepository.findById(id).
                orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public List<SentimentDTO> findAll() {
        return sentimentRepository.findAll()
                .stream()
                .map(mapper::toSentimentDTO)
                .toList();
    }

    @Override
    public void delete(Long id) {
        if(!sentimentRepository.existsById(id)){
            throw  new EntityNotFoundException("Sentiment not found");
        }
        sentimentRepository.deleteById(id);
    }

    @Override
    public SentimentDTO update(Long id, SentimentDTO sentimentDTO) {
        sentimentRepository.findById(id).
                orElseThrow(EntityNotFoundException::new);
        return null;
    }
}
