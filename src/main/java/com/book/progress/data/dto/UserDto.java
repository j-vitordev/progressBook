package com.book.progress.data.dto;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String photo;
    private String readerLevel;

}
