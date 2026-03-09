package org.email.emailrabiqt.Repository;

import org.email.emailrabiqt.Entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {

}
