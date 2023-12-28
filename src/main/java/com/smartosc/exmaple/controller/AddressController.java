package com.smartosc.exmaple.controller;

import com.smartosc.exmaple.controller.dto.AddressDetailDTO;
import com.smartosc.exmaple.controller.dto.AddressWithCityDTO;
import com.smartosc.exmaple.controller.dto.AddressWithUserDTO;
import com.smartosc.exmaple.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@CrossOrigin
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @GetMapping("/userId/{id}")
    public List<AddressWithUserDTO> getByUserId(@PathVariable("id") Long userId) {
        return addressService.getAddressByUserId(userId);
    }


    @GetMapping("/cityId/{id}")
    public List<AddressWithCityDTO> getByCityId(@PathVariable("id") Long cityId) {
        return addressService.getAddressByCityId(cityId);
    }

    @GetMapping("/all")
    public List<AddressDetailDTO> getAll() {
        return addressService.findAllEagerUserAndCity();
    }
}
