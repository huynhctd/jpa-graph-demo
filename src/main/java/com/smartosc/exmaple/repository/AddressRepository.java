package com.smartosc.exmaple.repository;

import com.smartosc.exmaple.domain.AddressEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    @EntityGraph(AddressEntity.WITH_USER_AND_CITY_GRAPH)
    List<AddressEntity> findAll();

    @EntityGraph(AddressEntity.WITH_USER_GRAPH)
    List <AddressEntity> findByUserId(Long userId);

    @EntityGraph(AddressEntity.WITH_CITY_GRAPH)
    List<AddressEntity> findByCityId(Long cityId);

    Optional<AddressEntity> findById(Long id);

}
