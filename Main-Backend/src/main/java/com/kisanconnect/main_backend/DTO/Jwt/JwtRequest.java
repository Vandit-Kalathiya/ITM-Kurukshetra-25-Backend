package com.kisanconnect.main_backend.DTO.Jwt;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtRequest {
	private String phoneNumber;
}
