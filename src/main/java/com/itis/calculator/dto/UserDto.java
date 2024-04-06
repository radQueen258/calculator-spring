package com.itis.calculator.dto;

import com.itis.calculator.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String email;

//    public static UserDto from(User user) {
//        return UserDto.builder()
//                .id(user.getId())
//                .username(user.getUsername())
//                .email(user.getEmail())
//                .build();
//    }
}
