package com.svmapp.repo.db;

import java.util.Collection;
import java.util.Map;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.Entity;
import com.svmapp.services.EntityService;

public class EntityServiceImpl<T extends Entity> implements EntityService<T> {

	@Override
	public ApiResponse setState(String entityId, String state, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse activate(String entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse deActivate(String entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T insert(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}
	public ApiResponse delete(Collection<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> get(Map<String, String> query, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ApiResponse delete(T entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
