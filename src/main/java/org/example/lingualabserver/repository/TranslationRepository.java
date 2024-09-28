package org.example.lingualabserver.repository;

import org.example.lingualabserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository extends JpaRepository<User, Long> {
}