package com.smartosc.exmaple.domain;

import lombok.EqualsAndHashCode;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
@EqualsAndHashCode
public class RoleEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    String name;
}
