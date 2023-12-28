package com.smartosc.exmaple.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressShortDTO {
    private String title;
    private String street;
    private String postalCode;
}
