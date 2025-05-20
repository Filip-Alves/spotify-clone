package com.me.spotifyclone.catalogcontext.application.mapper;

import com.me.spotifyclone.catalogcontext.application.dto.SaveSongDTO;
import com.me.spotifyclone.catalogcontext.application.dto.SongContentDTO;
import com.me.spotifyclone.catalogcontext.domain.SongContent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SongContentMapper {

    @Mapping(source = "song.publicId", target = "publicId")
    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDTO songDTO);
}
