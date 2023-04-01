package com.skill.kamp.web.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class Product {

    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotNull
//    @DecimalMin("0.00")
    private int price;

    @NotNull
    @Min(0)
    private int stock;

    @NotNull
    private int category;

    @NotBlank
    private String image;


    private String createdDate;

    @NotBlank
    private String createdBy;


    private String updatedDate;

    @NotBlank
    private String updatedBy;
}
