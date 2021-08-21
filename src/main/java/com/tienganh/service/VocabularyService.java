package com.tienganh.service;

import java.util.List;

import com.tienganh.entity.Vocabulary;

public interface VocabularyService {

	List<Vocabulary> findAll();

	Vocabulary save(String eng, String vi);

	List<Vocabulary> seach(String seach);

	Vocabulary changeEnable(Long id);

	Vocabulary findById(Long id);

	Vocabulary updateVocabulary(Long id, String eng, String vi);

}
