package com.example.catalogonline.model;

public enum GradeTye {

    UNU(1),
    DOI(2),
    TREI(3),
    PATRU(4),
    CINCI(5),
    SASE(6),
    SAPTE(7),
    OPT(8),
    NOUA(9),
    ZECE(10),
    ;

    private final int value;
    GradeTye(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    }

