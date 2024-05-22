package com.bookmarker.api.dto;

import com.bookmarker.api.domain.Bookmark;
import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    // 엔티티를 dto 로 변경해줌
    // 엔티티에서 메서드 생성하고 DTO 의 builder 를 사용하면 더 편할 수도 있겠다
    public BookmarkDTO toDTO(Bookmark bookmark) {
        return new BookmarkDTO(
                bookmark.getId(),
                bookmark.getTitle(),
                bookmark.getUrl(),
                bookmark.getCreatedAt()
        );
    }
}