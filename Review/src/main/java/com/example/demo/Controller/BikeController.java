package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.BikeModel;
import com.example.demo.service.BikeService;

@RestController

public class BikeController 
{
	@Autowired
	public BikeService cser;
		
	@PostMapping("/postm")
	public BikeModel addDetails(@RequestBody BikeModel cr)
	{
		return cser.saveInfo(cr);
	}
	@GetMapping("/getma")
	public List <BikeModel> getDetails()
	{
		return cser.getInfo();
	}
	
	@PutMapping("/updatem")
	public BikeModel updateDetails(@RequestBody BikeModel bikenum)
	{
		return cser.updateInfo(bikenum);
	}
	
	@DeleteMapping("delete/{cid}")
	public String deleteDetails (@PathVariable ("cid") int bikenum)
	{
		cser.deleteInfo(bikenum);
		return "Bike number "+bikenum+" is deleted";
				
	}
	@DeleteMapping("/deleteReq")
	public String deleteByReq(@RequestParam ("cid") int bikenum)
	{
		cser.deleteInfo(bikenum);
		return "Bike number "+bikenum+" is deleted";
	}
}
