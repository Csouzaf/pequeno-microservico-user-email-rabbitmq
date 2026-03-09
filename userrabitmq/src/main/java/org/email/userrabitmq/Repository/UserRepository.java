package org.email.userrabitmq.Repository;

import org.email.userrabitmq.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
