package com.arturishmaev.sprinbootlocal.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private Long id;
    private String firsName;
    private String LastName;
    private int age;
    private String profession;
}
