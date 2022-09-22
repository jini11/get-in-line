package com.uno.getinline.domain;

import com.uno.getinline.constant.PlaceType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Place {
    private Long id;

    private PlaceType placeType;
    private String placeNum;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String meno;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
