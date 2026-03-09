package org.email.emailrabiqt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import org.email.emailrabiqt.Enum.EmailStatus;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "email")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    @Id
    private UUID uuid;

    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "email_from")
    private String emailFrom;

    @Column(name = "email_to")
    private String emailTo;

    @Column(name = "email_subject")
    private String emailSubject;

    @Column(name = "email_body", columnDefinition = "text")
    private String emailBody;

    @Column(name = "send_date_email")
    private LocalDateTime sendDateEmail;

    private EmailStatus emailStatus;
}
