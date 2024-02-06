package com.micro.i113_resources.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "languages")
public class LanguageEntity  implements Comparable<LanguageEntity>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String param;

    @NonNull
    private String eng;
    private String rus;

    @Override
    public int compareTo(LanguageEntity o) {
        if (param.equals(o.getParam())) {
            return 0;
        } else {
            return 1;
        }
    }


}
