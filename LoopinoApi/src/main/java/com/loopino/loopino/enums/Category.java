package com.loopino.loopino.enums;

public enum Category {
	ART_AND_DESIGN("Art & Design"),
    LITERATURE("Literature"),
    PHOTOGRAPHY("Photography"),
    MUSIC("Music"),
    MOVIES_AND_SERIES("Movies & Series"),
    GAMES("Games"),
    TECHNOLOGY("Technology"),
    SCIENCE_AND_INNOVATION("Science & Innovation"),
    SPORTS("Sports"),
    TRAVEL_AND_TOURISM("Travel & Tourism"),
    HEALTH_AND_FITNESS("Health & Fitness"),
    WELLNESS_AND_MEDITATION("Wellness & Meditation"),
    NUTRITION_AND_FOOD("Nutrition & Food"),
    FASHION_AND_BEAUTY("Fashion & Beauty"),
    HOBBIES_AND_DIY("Hobbies & DIY"),
    MINIMALISM_AND_SUSTAINABILITY("Minimalism & Sustainability"),
    FAMILY_AND_RELATIONSHIPS("Family & Relationships"),
    PARENTING("Parenting"),
    PERSONAL_DEVELOPMENT("Personal Development"),
    PROGRAMMING_AND_SOFTWARE_DEVELOPMENT("Programming & Software Development"),
    MARKETING_AND_BUSINESS("Marketing & Business"),
    FINANCE_AND_INVESTING("Finance & Investing"),
    EDUCATION_AND_LEARNING("Education & Learning"),
    CAREER_AND_NETWORKING("Career & Networking"),
    ENTREPRENEURSHIP("Entrepreneurship"),
    SCIENTIFIC_RESEARCH("Scientific Research"),
    SOCIAL_CAUSES_AND_HUMAN_RIGHTS("Social Causes & Human Rights"),
    POLITICS_AND_CURRENT_EVENTS("Politics & Current Events"),
    SPIRITUALITY_AND_RELIGION("Spirituality & Religion"),
    HISTORY_AND_CULTURE("History & Culture"),
    LGBTQIA_AND_DIVERSITY("LGBTQIA+ & Diversity"),
    LOCAL_COMMUNITIES("Local Communities"),
    VOLUNTEERING_AND_SOCIAL_ACTION("Volunteering & Social Action"),
    MEMES_AND_HUMOR("Memes & Humor"),
    POP_CULTURE("Pop Culture"),
    ANIME_AND_MANGA("Anime & Manga"),
    COMICS("Comics"),
    BOARD_GAMES_AND_RPG("Board Games & RPG"),
    PODCASTS("Podcasts"),
    PETS_AND_ANIMALS("Pets & Animals"),
    NATURE_AND_ENVIRONMENT("Nature & Environment"),
    LANDSCAPE_PHOTOGRAPHY("Landscape Photography"),
    ECOTOURISM("Ecotourism"),
    AGRICULTURE_AND_GARDENING("Agriculture & Gardening"),
    ARTIFICIAL_INTELLIGENCE("Artificial Intelligence"),
    ROBOTICS("Robotics"),
    BLOCKCHAIN_AND_CRYPTOCURRENCY("Blockchain & Cryptocurrency"),
    ASTRONOMY_AND_SPACE_EXPLORATION("Astronomy & Space Exploration"),
    BIOTECHNOLOGY_AND_GENETICS("Biotechnology & Genetics");

	private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
	
}
