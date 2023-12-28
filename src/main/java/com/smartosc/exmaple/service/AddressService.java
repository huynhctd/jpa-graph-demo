package com.smartosc.exmaple.service;

import com.smartosc.exmaple.controller.dto.AddressDetailDTO;
import com.smartosc.exmaple.controller.dto.AddressWithCityDTO;
import com.smartosc.exmaple.controller.dto.AddressWithUserDTO;

import java.util.List;

public interface AddressService {
    List<AddressWithUserDTO> getAddressByUserId(Long userId);
    List<AddressWithCityDTO> getAddressByCityId(Long cityId);
    List<AddressDetailDTO> findAllEagerUserAndCity();
}
