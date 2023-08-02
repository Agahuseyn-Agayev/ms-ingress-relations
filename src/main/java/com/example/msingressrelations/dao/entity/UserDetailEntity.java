package com.example.msingressrelations.dao.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_details")
<<<<<<< HEAD
//@NamedEntityGraph(name="user_details_entity_graph",attributeNodes = @NamedAttributeNode("addresses"))
=======
@NamedEntityGraph(name="user_details_entity_graph",attributeNodes = @NamedAttributeNode("addresses"))
>>>>>>> 890144db51b7b759530939ef8c127eaa9b375f48
public class UserDetailEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name="age")
    private Long age;

    @Column(name="created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name="update_at")
    @UpdateTimestamp
    private LocalDateTime updateAt;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "user")
    private List<AddressesEntity>addresses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetailEntity that = (UserDetailEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
