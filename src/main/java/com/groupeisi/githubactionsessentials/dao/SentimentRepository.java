package com.groupeisi.githubactionsessentials.dao;

import com.groupeisi.githubactionsessentials.entities.Sentiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentRepository extends JpaRepository<Sentiment, Long> {
}
