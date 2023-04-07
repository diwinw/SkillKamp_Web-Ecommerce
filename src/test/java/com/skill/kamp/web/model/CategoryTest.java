package com.skill.kamp.web.model;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CategoryTest {

    @Test
    public void testCategory() {
        Category category = new Category();
        category.setId("123");
        category.setName("Books");

        assertEquals("123", category.getId());
        assertEquals("Books", category.getName());
    }
}
