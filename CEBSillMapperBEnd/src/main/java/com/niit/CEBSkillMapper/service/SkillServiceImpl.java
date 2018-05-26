package com.niit.CEBSkillMapper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.CEBSkillMapper.Dao.SkillDAO;
import com.niit.CEBSkillMapper.model.Skills;



@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillDAO skillDAO;

	@Override
	public boolean add(Skills skill) {
		return skillDAO.add(skill);
	}

	@Override
	public boolean delete(Skills skil) {
		return skillDAO.delete(skil);
	}

	@Override
	public boolean update(Skills profile) {
		// TODO Auto-generated method stub
		return skillDAO.update(profile);
	}

	@Override
	public List<Skills> getAllSkills() {
		return skillDAO.getAllSkills();
	}

	@Override
	public List<Skills> SearchSkills(String keywords) {
		return skillDAO.SearchSkills(keywords);
	}

}
