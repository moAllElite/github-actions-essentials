package com.groupeisi.githubactionsessentials.mapper;

import com.groupeisi.githubactionsessentials.dto.SentimentDTO;
import com.groupeisi.githubactionsessentials.entities.Sentiment;
import org.springframework.stereotype.Component;

@Component
public class SentimentMapperImpl implements ISentimentMapper {
    @Override
    public SentimentDTO toSentimentDTO(Sentiment sentiment) {
        return SentimentDTO.builder()
                .id(sentiment.getId())
                .message(sentiment.getMessage())
                .status(sentiment.getStatus())
                .build();
    }

    @Override
    public Sentiment toSentiment(SentimentDTO sentimentDTO) {
        return Sentiment.builder()
                .id(sentimentDTO.id())
                .message(sentimentDTO.message())
                .status(sentimentDTO.status())
                .build();
    }
}
