package com.example.demospring.models;

import com.example.demospring.bases.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "users")
public class User{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_user")
    private Integer idUser;
    @NotBlank
    @Nationalized
    @Column(name = "name")
    private String name;
    private String address;
    private String birthday;
    @Email
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<Cloth> cloths;
}
