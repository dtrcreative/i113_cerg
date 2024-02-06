package com.micro.i113_resources.service;

import com.micro.i113_resources.exception.ResourceException;
import com.micro.i113_resources.model.dto.LanguageDto;
import com.micro.i113_resources.model.entity.LanguageEntity;
import com.micro.i113_resources.repository.LanguageRepository;
import com.micro.i113_resources.service.converter.LanguageConverter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class LanguageService {

    private LanguageRepository repository;
    private LanguageConverter converter;

    public List<LanguageDto> selectAll(){
        List<LanguageEntity> entityList = repository.findAll();
        if(entityList.size()>0){
            return converter.convertEntitiesToDto(entityList);
        }
        return new ArrayList<>();
    }

    public LanguageDto create(LanguageDto languageDto){
        LanguageEntity entity = repository.save(converter.convertDtoToEntity(languageDto));
        return converter.convertEntityToDto(entity);
    }

    public LanguageDto update(LanguageDto languageDto){
        Optional<LanguageEntity> entityOptional = repository.findById(languageDto.getId());
        if(entityOptional.isPresent()){
            LanguageEntity updatedEntity = converter.convertDtoToEntity(languageDto);
            updatedEntity.setId(entityOptional.get().getId());
            repository.save(updatedEntity);
            return converter.convertEntityToDto(updatedEntity);
        }
        throw new ResourceException("Update Language error. id not exist", HttpStatus.BAD_REQUEST);
    }

    public void delete(int id){
        Optional<LanguageEntity> entity = repository.findById(id);
        entity.ifPresent(foundedEntity -> repository.delete(foundedEntity));
    }

    public void deleteSelected(List<Integer> selected){
        repository.deleteAllById(selected);
    }

    public int createByListAndCountSuccessful(List<LanguageDto> inputDtoList){
        List<LanguageEntity> baseEntities = repository.findAll();
        List<LanguageEntity> inputList = converter.convertDtoToEntities(inputDtoList);
        int counter = 0;
        for (LanguageEntity inputEntity : inputList) {
            if(!isExist(baseEntities, inputEntity)){
                repository.save(inputEntity);
                counter++;
            }
        }
        return counter;
    }

    private boolean isExist(List<LanguageEntity> inputLanguageList, LanguageEntity inputLanguageEntity){
        for(LanguageEntity entity: inputLanguageList){
            if(entity.compareTo(inputLanguageEntity) == 0){
                return true;
            }
        }
        return false;
    }

    public int replaceAllByListAndCount(List<LanguageDto> inputDtoList){
        repository.deleteAll();
        repository.saveAllAndFlush(converter.convertDtoToEntities(inputDtoList));
        return inputDtoList.size();
    }



}
