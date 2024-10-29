package com.example.Digital_Library.dto;

import lombok.*;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchBookResponse {

    List<BookResponse> bookResponses;

}
