package com.switchly.api.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateOrganizationRequest(
        @NotBlank(message = "Organization name cannot be blank")
        String name
) {
}