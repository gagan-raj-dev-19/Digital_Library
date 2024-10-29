package com.example.Digital_Library.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class SearchRequest {

    @NotBlank
    private String searchKey;

    @NotBlank
    private String searchValue;

}





