package com.vladick.project.services;

import com.vladick.project.entity.Girl;
import com.vladick.project.repository.GirlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeGirlService {
	private final GirlRepository girlRepository;

	public List<Girl> findsAll() {
		return girlRepository.findAll();
	}

	public Girl createGirl(Girl girl) {
		return girlRepository.save(girl);
	}

	public Girl updateGirl(Girl girl) {
		return girlRepository.save(girl);
	}

	public void deleteGirl(Long id) {
		girlRepository.deleteById(id);
	}
}
