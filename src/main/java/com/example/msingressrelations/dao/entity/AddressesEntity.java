package com.example.msingressrelations.dao.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;


@Data
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class AddressesEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name="addresses1")
    private String addresses1;

    @Column(name="addresses2")
    private String addresses2;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @CreationTimestamp
    @Column(name="created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name="update_at")
    private LocalDateTime updateAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private UserDetailEntity user;


}
