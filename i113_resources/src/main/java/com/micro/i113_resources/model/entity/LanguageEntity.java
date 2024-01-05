package com.micro.i113_resources.model.entity;

import com.micro.i113_resources.model.Type;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "languages")
public class LanguageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String param;

    @Enumerated(EnumType.STRING)
    private Type type;

    @NonNull
    private String eng;
    private String rus;


}
