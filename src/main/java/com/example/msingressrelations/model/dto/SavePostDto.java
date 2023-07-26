package com.example.msingressrelations.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavePostDto {
    private String tittle;
    private String createdBy;
    private Set<Long> tagsIds;

}
