package com.monthlyexpenses.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cate_id;
    @Column(name="user_id")
    private long userId;
    @Column(name="name")
    private String name;
}
