package com.svmapp.services;

import java.sql.Date;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.Japaflow;
import com.svmapp.model.ResponseModel;

public interface JapaService extends EntityService<Japaflow> {

	public Japaflow getCount(Long id);
	public ResponseModel insertJapadetails(Japaflow japadetails);
	public Japaflow updateJapadetails(Japaflow japadetails);
	public Japaflow getJapaDetails(Date date, String booklet_language, String booklet_id);
	public ApiResponse deleteJapadetails(Long id);
}
