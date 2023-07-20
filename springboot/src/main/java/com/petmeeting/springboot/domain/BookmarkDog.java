package com.petmeeting.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkDog {
    @Id @GeneratedValue
    @Column(name = "bookmark_dog_no")
    private Integer bookmarkDogNo;
}