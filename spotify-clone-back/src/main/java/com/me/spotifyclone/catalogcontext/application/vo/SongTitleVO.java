package com.me.spotifyclone.catalogcontext.application.vo;

import jakarta.validation.constraints.NotBlank;

public record SongTitleVO(@NotBlank String value) {
}
