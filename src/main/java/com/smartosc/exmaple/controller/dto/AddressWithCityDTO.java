package com.smartosc.exmaple.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressWithCityDTO extends AddressShortDTO{
    CityDTO city;
}
