package com.smartosc.exmaple.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDetailDTO extends AddressShortDTO {
    UserDTO user;
    CityDTO city;
}
