package com.micro.i113_resources.repository;

import com.micro.i113_resources.model.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<LanguageEntity, Integer> {

    List<LanguageEntity> findAll();

}
