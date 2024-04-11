package com.ex.notice.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {

    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;
}
