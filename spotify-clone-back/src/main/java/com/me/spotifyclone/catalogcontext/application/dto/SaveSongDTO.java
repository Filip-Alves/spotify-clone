package com.me.spotifyclone.catalogcontext.application.dto;

import com.me.spotifyclone.catalogcontext.application.vo.SongAuthorVO;
import com.me.spotifyclone.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(@Valid SongTitleVO title,
                          @Valid SongAuthorVO author,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}
