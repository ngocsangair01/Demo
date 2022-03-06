package com.example.demospring.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_store")
    private Integer id;
    private String name;
    private String address;
    @ManyToMany
    @JoinTable(name = "cloth_store",
    joinColumns = @JoinColumn(name = "id_store",referencedColumnName = "id_store"),
    inverseJoinColumns = @JoinColumn(name = "id_cloth",referencedColumnName = "id_cloth")
    )
    private Set<Cloth> clothSet;
}
