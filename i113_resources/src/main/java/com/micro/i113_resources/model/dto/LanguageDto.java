package com.micro.i113_resources.model.dto;

import com.micro.i113_resources.model.Type;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LanguageDto {

    private Integer id;

    @NonNull
    private String param;

    @Enumerated(EnumType.STRING)
    private Type type;

    @NonNull
    private String eng;
    private String rus;

}
