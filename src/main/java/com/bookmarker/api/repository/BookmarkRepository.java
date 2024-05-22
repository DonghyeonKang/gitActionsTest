package com.bookmarker.api.repository;

import com.bookmarker.api.domain.Bookmark;
import com.bookmarker.api.dto.BookmarkDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Page<BookmarkDTO> findByTitleContainsIgnoreCase(String query, Pageable pageable);
}