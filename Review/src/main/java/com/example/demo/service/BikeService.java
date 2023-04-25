package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.BikeModel;
import com.example.demo.Repository.BikeRepository;
@Service

public class BikeService
{
	@Autowired
    public BikeRepository crepo;
	
	public BikeModel saveInfo(BikeModel c)
	{
		return crepo.save(c);
	}
	public List<BikeModel> getInfo()
	{
		return crepo.findAll();
	}
	public BikeModel updateInfo(BikeModel iu)
	{
		return crepo.saveAndFlush(iu);
		
	}
	public void deleteInfo(int id )
	{
		crepo.deleteById(id);
	}
}
