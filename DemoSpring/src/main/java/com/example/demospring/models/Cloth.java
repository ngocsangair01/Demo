package com.example.demospring.models;

import com.example.demospring.bases.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "cloths")
public class Cloth{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cloth")
    private Integer idCloth;
    @Nationalized
    @NotBlank
    private String name;
    @Nationalized
    private String brand;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToMany(mappedBy = "clothSet")
    private Set<Store> storeSet;
}
