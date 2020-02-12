package com.mobileprogramming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileprogramming.dao.CandidateRepository;
import com.mobileprogramming.model.Candidate;


@Service
public class CandidateService {
	
	@Autowired
private CandidateRepository candidateRepository;
	
	//Get All Candidates
	public List<Candidate> getAllCandidiates()
	{
		List<Candidate> list=new ArrayList<Candidate>();
		candidateRepository.findAll().forEach(list::add);
		return list;
		
	}
	
	//Get Candidate By Id
	public Optional<Candidate> getCandidate(Integer id)
	{
		return candidateRepository.findById(id);
		
	}
	
	//Create
	public void saveCandidate(Candidate candidate)
	{
		candidateRepository.save(candidate);
	}
	
	//Update
	public void updateCandidate(Integer id,Candidate candidate)
	{
		candidateRepository.save(candidate);
	}
	
	//Delete
	public void deleteCandidate(Integer id)
	{
		candidateRepository.deleteById(id);
	}
}
