package org.signify.OnlineContactManagementSystem.repository;

import org.signify.OnlineContactManagementSystem.entity.OnlineContactManagementSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineContactManagementSystemRepository extends JpaRepository<OnlineContactManagementSystem,Long> {
}
