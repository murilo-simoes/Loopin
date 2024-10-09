package com.loopino.loopino.enums;

public enum NotificationType {
    NEW_FOLLOWER("New Follower"),
    NEW_COMMENT("New Comment"),
    COMMENT_REPLY("Comment Reply"),
    NEW_LIKE("New Like"),
    NEW_REACTION("New Reaction"),
    POST_MENTION("Post Mention"),
    COMMENT_MENTION("Comment Mention"),
    CYCLE_INVITATION("Cycle Invitation"),
    LOOP_JOIN_REQUEST("Loop Join Request"),
    LOOP_APPROVAL("Loop Approval"),
    LOOP_REMOVAL("Loop Removal");

    private final String displayName;

    NotificationType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
