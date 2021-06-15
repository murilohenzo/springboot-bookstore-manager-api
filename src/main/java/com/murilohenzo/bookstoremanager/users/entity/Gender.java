package com.murilohenzo.bookstoremanager.users.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String description;

}
