package org.email.emailrabiqt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import org.email.emailrabiqt.Enum.EmailStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "email")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

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

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "send_date_email")
    private LocalDateTime sendDateEmail;

    private EmailStatus emailStatus;
}
