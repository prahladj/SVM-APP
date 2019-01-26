package com.svmapp.services;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.Japaflow;

public interface JapaService extends EntityService<Japaflow> {

	public Japaflow getCount(Long id);
	public Japaflow insertJapadetails(Japaflow japadetails);
	public Japaflow updateJapadetails(Japaflow japadetails);
	public ApiResponse deleteJapadetails(Long id);
}
