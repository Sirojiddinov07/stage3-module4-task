package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.AuthorModel;
import com.mjc.school.repository.model.NewsModel;
import com.mjc.school.service.dto.AuthorRequestDTO;
import com.mjc.school.service.dto.AuthorResponseDTO;
import com.mjc.school.service.dto.NewsRequestDTO;
import com.mjc.school.service.dto.NewsResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper
public interface NewsModelMapper {
    @Mapping(target = "title", source = "id")
    @Mapping(target = "authorId", source = "author.id")
    NewsResponseDTO modelToDTO(NewsModel newsModel);
    List<NewsResponseDTO> modelListToDtoList (List<NewsModel> newsList);
    @Mappings(value = {@Mapping(target = "createDate", ignore = true),
            @Mapping(target = "lastUpdateDate", ignore = true),
            @Mapping(target = "author.id", source = "authorId"),
            @Mapping(target = "id", ignore = true)
    })
    NewsModel dtoToModel (NewsRequestDTO requestDTO);
}
