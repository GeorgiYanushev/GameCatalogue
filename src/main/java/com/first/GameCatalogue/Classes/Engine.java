package com.first.GameCatalogue.Classes;

import jakarta.persistence.Embeddable;

@Embeddable
public class Engine {
    private String name;
    private double version;
    private String type;

}
