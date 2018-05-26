package com.niit.CEBSkillMapper.service;

import java.util.List;

import com.niit.CEBSkillMapper.model.Skills;


public interface SkillService {
	boolean add(Skills skill);
	boolean delete(Skills skil);
	boolean update(Skills profile);	
	List<Skills> getAllSkills(); 
	List<Skills> SearchSkills(String keywords);
}
