package repository;

import model.PhoneRecord;

import java.util.List;
import java.util.Optional;

public interface PhoneRepository {

	//	CRUD OPERATIONS
	//	CRUD OPERATIONS
	//	CRUD OPERATIONS

	//	Create

	List<PhoneRecord> addPhones(List<PhoneRecord> addThesePhones);

	List<PhoneRecord> addOnePhone(PhoneRecord addPhones);

	//	Read

	List<PhoneRecord> getAllPhones(String phoneRecordFile);

	Optional<PhoneRecord> getOnePhone(int recordId);

	Optional<PhoneRecord> getOneSpecificPhoneRecord(String name, String surName, String number);


	//	Update

	PhoneRecord changePhoneRecord(PhoneRecord newRecord);

	//	Delete

	void killPhoneRecord(int recordId);

}
