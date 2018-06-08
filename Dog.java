package ru.foxit.grayfox;

/**
 * Author Dog.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

public class Dog {
    private String breed;
    private String name;

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
        this.name = name;
    }

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }
}
