package com.groupeisi.githubactionsessentials.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sentiment {
    @Id@GeneratedValue
    private Long id;
    private String message;
    private int status;

}
