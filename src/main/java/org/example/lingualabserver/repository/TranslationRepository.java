package org.example.lingualabserver.repository;

import org.example.lingualabserver.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository extends JpaRepository<Article, Long> {
}