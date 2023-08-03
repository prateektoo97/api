package api.trade.main.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import api.trade.main.entity.Nifty50;
import api.trade.main.repo.NiftyRepo;

@Service
public class NiftyService {
	
	@Autowired
	private NiftyRepo niftyRepo;
	
	
	public List<Nifty50> getAllStock(){
		
		List<Nifty50> niftyList = new ArrayList<>();
		Nifty50 nifty = new Nifty50();
		niftyRepo.findAll().forEach(niftyList::add);
		
		return niftyList;
		
	}



	
	

}
