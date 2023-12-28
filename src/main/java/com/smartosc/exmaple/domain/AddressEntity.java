package com.smartosc.exmaple.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Entity
@Table(name = "address")
@EqualsAndHashCode
@Data
@NamedEntityGraphs({
        @NamedEntityGraph(
                name = AddressEntity.WITH_USER_GRAPH,
                attributeNodes = {
                        @NamedAttributeNode("user")
                }
        ),
        @NamedEntityGraph(
                name = AddressEntity.WITH_CITY_GRAPH,
                attributeNodes = {
                        @NamedAttributeNode("city"),
                }
        ),
        @NamedEntityGraph(
                name = AddressEntity.WITH_USER_AND_CITY_GRAPH,
                attributeNodes = {
                        @NamedAttributeNode("user"),
                        @NamedAttributeNode("city")
                }
        )
})
public class AddressEntity implements Serializable {
    public static final String WITH_USER_GRAPH = "address-with-user-graph";
    public static final String WITH_CITY_GRAPH = "address-with-city-graph";
    public static final String WITH_USER_AND_CITY_GRAPH = "address-with-user-and-city-graph";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String street;
    private String postalCode;

    @OneToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
