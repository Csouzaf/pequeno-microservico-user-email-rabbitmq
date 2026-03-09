package org.email.emailrabiqt.Dto;

import java.util.UUID;

public record EmailDto(
        UUID id,
        String subject,
        String body
) {
}
