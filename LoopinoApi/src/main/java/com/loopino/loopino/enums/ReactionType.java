package com.loopino.loopino.enums;

public enum ReactionType {
    LIKE("Like"),
    LOVE("Love"),
    HAHA("Haha"),
    WOW("Wow"),
    SAD("Sad"),
    ANGRY("Angry"),
    SUPPORT("Support"),
    DISLIKE("Dislike");

    private final String displayName;

    ReactionType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

