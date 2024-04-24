package com.groupeisi.githubactionsessentials.mapper;

import com.groupeisi.githubactionsessentials.dto.SentimentDTO;
import com.groupeisi.githubactionsessentials.entities.Sentiment;

public interface ISentimentMapper {
    SentimentDTO toSentimentDTO(Sentiment sentiment);
    Sentiment toSentiment(SentimentDTO sentimentDTO);
}
