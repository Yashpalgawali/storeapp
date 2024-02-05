package com.storeapp.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.storeapp.demo.model.Vendor;

@Repository("vendrepo;")
public interface VendorRepo extends JpaRepository<Vendor, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE Vendor v SET v.vendor_name=:vname,v.vendor_email=:vemail,v.vendor_contact=:vcont,v.vendor_address=:vaddress,v.state=:state,v.city=:city,v.pincode=:pincode,v.gstno=:gst WHERE v.vendor_id=:id")
	public int updateVendor(String vname,String vemail,Long vcont,String vaddress,String state,String city,long pincode,String gst,Long id);
}
