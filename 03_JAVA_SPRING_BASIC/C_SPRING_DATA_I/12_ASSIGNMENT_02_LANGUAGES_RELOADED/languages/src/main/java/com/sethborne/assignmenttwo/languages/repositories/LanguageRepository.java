package com.sethborne.assignmenttwo.languages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmenttwo.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

}
