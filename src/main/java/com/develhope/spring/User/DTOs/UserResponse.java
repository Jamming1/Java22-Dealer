package com.develhope.spring.User.DTOs;

import com.develhope.spring.User.entity.Role;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String password;
    private Role role;
}