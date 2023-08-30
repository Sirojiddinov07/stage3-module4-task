package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.News;
import com.mjc.school.service.dto.NewsRequestDTO;
import com.mjc.school.service.dto.NewsResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper
public interface NewsModelMapper {
    @Mapping(target = "tagsSet", source = "tags")
    @Mapping(target = "authorId", source = "author.id")
    NewsResponseDTO modelToDTO(News newsModel);
    List<NewsResponseDTO> modelListToDtoList (List<Long> newsList);
    @Mappings(value = {@Mapping(target = "createDate", ignore = true),
            @Mapping(target = "lastUpdateDate", ignore = true),
            @Mapping(target = "author.id", source = "authorId"),
            @Mapping(target = "tags", ignore = true),
            @Mapping(target = "comments", ignore = true)
    })
    News dtoToModel (NewsRequestDTO requestDTO);

}
