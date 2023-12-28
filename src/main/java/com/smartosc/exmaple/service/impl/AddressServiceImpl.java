package com.smartosc.exmaple.service.impl;

import com.smartosc.exmaple.controller.dto.AddressDetailDTO;
import com.smartosc.exmaple.controller.dto.AddressWithCityDTO;
import com.smartosc.exmaple.controller.dto.AddressWithUserDTO;
import com.smartosc.exmaple.mapper.AddressMapper;
import com.smartosc.exmaple.repository.AddressRepository;
import com.smartosc.exmaple.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }


    @Override
    public List<AddressWithUserDTO> getAddressByUserId(Long userId) {
        return addressMapper.mapToAddressWithUserDTOS(addressRepository.findByUserId(userId));
    }

    @Override
    public List<AddressWithCityDTO> getAddressByCityId(Long cityId) {
        return addressMapper.mapToAddressWithCityDTOS(addressRepository.findByCityId(cityId));
    }

    @Override
    public List<AddressDetailDTO> findAllEagerUserAndCity() {
        return addressMapper.mapToAddressDetailDTOS(addressRepository.findAll());
    }
}
