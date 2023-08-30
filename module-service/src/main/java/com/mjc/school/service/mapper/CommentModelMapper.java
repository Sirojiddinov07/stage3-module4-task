package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.Comments;
import com.mjc.school.service.dto.CommentRequestDTO;
import com.mjc.school.service.dto.CommentResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper
public interface CommentModelMapper {

    @Mapping(target = "newsId", source = "news.id")
    CommentResponseDTO modelToDTO(Comments commentModel);

    List<CommentResponseDTO> modelListToDtoList (List<Comments> commentList);

    @Mappings(value = {@Mapping(target = "createDate", ignore = true),
            @Mapping(target = "lastUpdateDate", ignore = true),
            @Mapping(target = "news", ignore = true)
    })
    Comments dtoToModel (CommentRequestDTO requestDTO);
}
