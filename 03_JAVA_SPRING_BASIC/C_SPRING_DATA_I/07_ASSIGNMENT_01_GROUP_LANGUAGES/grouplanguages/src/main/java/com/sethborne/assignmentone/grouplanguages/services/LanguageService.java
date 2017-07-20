package com.sethborne.assignmentone.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmentone.grouplanguages.models.Language;

@Service

public class LanguageService {
	
	private List<Language> languages = new ArrayList(Arrays.asList(
		new Language("Python", "Seth", "1.0"),
		new Language("JavaScript", "Tim", "2.0"),
		new Language("Ruby", "Boaty", "12.0")
	));
	
	//return all books
	
	public List<Language> allLanguages(){
		return languages;
	}
	
	//return one book
	
	public Language findLanguageByIndex(int index) {
		if(index < languages.size()) {
			return languages.get(index);
		}
		else {
			return null;
		}
	}
	
	public void addLanguage(Language language) {
		languages.add(language);
	}
	
	public void updateLanguage(int id, Language language) {
		if(id < languages.size()) {
			languages.set(id, language);
		}
	}
	
	public void deleteLanguage(int id) {
		if (id < languages.size()) {
			languages.remove(id);			
		}
	}
}
