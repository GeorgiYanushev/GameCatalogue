package com.first.GameCatalogue.Models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Engine {
    private String name;
    private double version;
    private String type;

}
