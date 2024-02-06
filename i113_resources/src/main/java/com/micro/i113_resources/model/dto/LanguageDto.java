package com.micro.i113_resources.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LanguageDto {

    private Integer id;

    @NonNull
    private String param;

    @NonNull
    private String eng;
    private String rus;

}
