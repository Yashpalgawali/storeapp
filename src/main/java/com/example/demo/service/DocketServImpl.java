package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Docket;
import com.example.demo.repository.DocketRepo;

@Service("dockserv")
public class DocketServImpl implements DocketService {

	@Autowired
	DocketRepo dockrepo;
	
	@Override
	public Docket saveDocket(Docket dock) {
		// TODO Auto-generated method stub
		return dockrepo.save(dock);
	}

	@Override
	public List<Docket> getAllDockets() {
		// TODO Auto-generated method stub
		return dockrepo.findAll();
	}

	@Override
	public Docket getDocketById(String id) {
		// TODO Auto-generated method stub
		Integer did = Integer.parseInt(id);
		
		
		Docket dct = dockrepo.getById(did);
		
		if(dct!=null)
		{
			return dct ;
		}
	
		return dct ;
		
	}

	@Override
	public int updateDocket(Docket dock) {
		// TODO Auto-generated method stub
		
		return dockrepo.updateDocket(dock.getOrder_id(), dock.getCust_name(), dock.getDocket_num(), dock.getParty().getParty_id(),dock.getDocket_id());
	}

	@Override
	public List<Docket> getAllDocketsWithJoin() {
		// TODO Auto-generated method stub
		return dockrepo.getAllDockets();
	}

}
