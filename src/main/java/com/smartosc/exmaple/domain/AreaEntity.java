package com.smartosc.exmaple.domain;

import lombok.EqualsAndHashCode;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "areas")
@EqualsAndHashCode
@Setter
public class AreaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private AreaEntity parent;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    Set<AreaEntity> children;

    String name;

}
