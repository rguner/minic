package com.guner.datastructure.colllection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Room {
    private String name;
    private int price;
}
