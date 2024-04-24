package com.groupeisi.githubactionsessentials.dto;

import lombok.Builder;

@Builder
public record SentimentDTO(
        Long id,
        String message,
        int status
) {
}
