package com.webshop.converter;

import org.springframework.stereotype.Component;

import com.webshop.dto.NewDTO;
import com.webshop.entity.NewEntity;

@Component
public class NewConverter {

	public NewEntity toEntity(NewDTO dto) {
		NewEntity entity = new NewEntity();
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		return entity;
	}

	public NewDTO toDTO(NewEntity entity) {
		NewDTO dto = new NewDTO();
		if(entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setThumbnail(entity.getThumbnail());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedDate(entity.getModifiedDate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setModifiedBy(entity.getModifiedBy());
	
		return dto;
	}
	
	public NewEntity toEntity(NewDTO dto, NewEntity entity) {
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		return entity;
	}
}
