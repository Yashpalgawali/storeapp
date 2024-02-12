package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.example.demo.model.Temp_Invoice;
import com.example.demo.repository.TempInvoiceRepo;

@Service("tempinvserv")
public class TempInvoiceServImpl implements TempInvoiceService {

	@Autowired
	TempInvoiceRepo tempinvrepo;
	
	@Override
	public Temp_Invoice saveTempInvoice(Temp_Invoice tin) {
		// TODO Auto-generated method stub
		return tempinvrepo.save(tin);
	}

	@Override
	public List<Temp_Invoice> getTempInvById(Integer tid) {
		// TODO Auto-generated method stub
		
		return tempinvrepo.getTempInvById(tid);
	}

	@Override
	public Integer getMaxTempInvoiceId() {
		// TODO Auto-generated method stub
		
		return  tempinvrepo.getMaxTempInvoiceNum();
	
	}

	@Override
	public boolean deleteSelectedTempInvoice(String temp_id) {
		// TODO Auto-generated method stub
		Integer tid = Integer.parseInt(temp_id);
		
		if(tempinvrepo.existsById(tid))
		{
			tempinvrepo.deleteById(tid);
			//tempinvrepo.deleteTempInvoiceByTempInvId(tid);
			return true;
		}
		else {
			return false;
		}
	}

}