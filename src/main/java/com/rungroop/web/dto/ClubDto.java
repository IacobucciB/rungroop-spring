package com.rungroop.web.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClubDto {
    private long id;
    private String title;
    private String photoUrl;
    private String content;
    private LocalDateTime createdOn;     
    private LocalDateTime updatedOn;    
}
