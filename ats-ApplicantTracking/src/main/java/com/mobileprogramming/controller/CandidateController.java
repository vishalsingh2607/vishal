package com.mobileprogramming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileprogramming.model.Candidate;
import com.mobileprogramming.service.CandidateService;

@RestController
public class CandidateController {
		
     
	@Autowired
	private CandidateService candidateService;

	@RequestMapping("/candidates")
	public List<Candidate> getAllCandid()
	{
		return candidateService.getAllCandidiates();
	}
	
	@RequestMapping("/candidates/{id}")
	public Optional<Candidate> getCandid( @PathVariable Integer id)
	{
		return candidateService.getCandidate(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/candidates")
	public void addCandid(@RequestBody Candidate candidate)
	{
		candidateService.saveCandidate(candidate);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/candidates/{id}")
	public void updateCandid(@RequestBody Candidate candidate, @PathVariable Integer id)
	{
		candidateService.updateCandidate(id, candidate);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/candidates/{id}")
	public void deleteCandid(@PathVariable Integer id)
	{
		candidateService.deleteCandidate(id);
	}

	   
	 
}
