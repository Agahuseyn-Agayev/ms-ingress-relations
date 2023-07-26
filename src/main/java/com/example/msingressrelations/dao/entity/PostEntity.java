package com.example.msingressrelations.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String tittle;
    @OneToOne(
            mappedBy = "post",
            cascade =ALL,
            fetch = LAZY
    )
    @ToString.Exclude
    private PostDetailEntity detail;

    @OneToMany(
            mappedBy = "post",
            cascade = ALL
    )
    @ToString.Exclude
    private List<CommentEntity> comments;

    @ManyToMany(cascade = ALL)
    @JoinTable(
            name="post_tag",
            joinColumns = @JoinColumn(name="post_id"),
            inverseJoinColumns = @JoinColumn(name="tag_id")
    )
    @ToString.Exclude
    private List<TagEntity> tags;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostEntity that = (PostEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
