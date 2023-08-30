package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.Tag;
import com.mjc.school.service.dto.TagRequestDTO;
import com.mjc.school.service.dto.TagResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface TagModelMapper {

    TagResponseDTO modelToDTO(Tag model);

    List<TagResponseDTO> modelListToDtoList(List<Tag> modelList);

    @Mapping(target = "news", ignore = true)
    Tag dtoToModel(TagRequestDTO dto);

}
