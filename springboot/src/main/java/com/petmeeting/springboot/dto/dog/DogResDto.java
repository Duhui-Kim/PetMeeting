package com.petmeeting.springboot.dto.dog;

import com.petmeeting.springboot.domain.Dog;
import com.petmeeting.springboot.enums.AdoptionAvailability;
import com.petmeeting.springboot.enums.DogSize;
import com.petmeeting.springboot.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DogResDto {

    private Integer dogNo;
    private String name;
    private String dogSize;
    private String gender;
    private Integer weight;
    private Integer age;
    private String personality;
    private Long protectionStartDate;
    private Long protectionEndDate;
    private String adoptionAvailability;
    private String currentStatus;
    private String dogSpecies;
    private String reasonAbandonment;
    private Boolean isInoculated;
    private String imagePath;

    public static DogResDto entityToDto(Dog dog){
        return DogResDto.builder()
                .dogNo(dog.getDogNo())
                .name(dog.getName())
                .dogSize(dog.getDogSize().getValue())
                .gender(dog.getGender().getValue())
                .weight(dog.getWeight())
                .age(dog.getAge())
                .personality(dog.getPersonality())
                .protectionStartDate(dog.getProtectionStartDate())
                .protectionEndDate(dog.getProtectionEndDate())
                .adoptionAvailability(dog.getAdoptionAvailability().getValue())
                .currentStatus(dog.getCurrentStatus())
                .dogSpecies(dog.getDogSpecies())
                .reasonAbandonment(dog.getReasonAbandonment())
                .isInoculated(dog.getIsInoculated())
                .imagePath(dog.getImagePath())
                .build();
    }

}
