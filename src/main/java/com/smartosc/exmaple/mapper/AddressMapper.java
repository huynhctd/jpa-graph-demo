package com.smartosc.exmaple.mapper;

import com.smartosc.exmaple.controller.dto.AddressDetailDTO;
import com.smartosc.exmaple.controller.dto.AddressWithCityDTO;
import com.smartosc.exmaple.controller.dto.AddressWithUserDTO;
import com.smartosc.exmaple.domain.AddressEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressDetailDTO mapToAddressDetailDTO(AddressEntity addressEntity);

    List<AddressDetailDTO> mapToAddressDetailDTOS(List<AddressEntity> entities);

    AddressWithUserDTO mapToAddressWithUserDTO(AddressEntity addressEntity);

    List<AddressWithUserDTO> mapToAddressWithUserDTOS(List<AddressEntity> entities);

    AddressWithCityDTO mapToAddressWithCityDTO(AddressEntity addressEntity);

    List<AddressWithCityDTO> mapToAddressWithCityDTOS(List<AddressEntity> entities);
}
