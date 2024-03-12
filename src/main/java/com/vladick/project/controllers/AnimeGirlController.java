package com.vladick.project.controllers;

import com.vladick.project.entity.Girl;
import com.vladick.project.services.AnimeGirlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/girls")
public class AnimeGirlController {
	private final AnimeGirlService animeGirlService;

	@GetMapping
	public List<Girl> findAll() {
		return animeGirlService.findsAll();
	}

	@PostMapping
	public Girl createGirl(@RequestBody Girl girl) {
		return animeGirlService.createGirl(girl);
	}

	@PutMapping
	public Girl updateGirl(@RequestBody Girl girl) {
		return animeGirlService.updateGirl(girl);
	}

	@DeleteMapping("/{id}")
	public void deleteGirl(@PathVariable Long id) {
		animeGirlService.deleteGirl(id);
	}
}
