package com.webshop.service;

import com.webshop.dto.NewDTO;

public interface INewService {

	NewDTO save(NewDTO newDTO);
	//NewDTO update(NewDTO newDTO);
	void delete(long[] ids);
}
