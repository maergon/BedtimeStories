package com.malkollm.bedtimestories;

public class StoryModel {
    String category, description, text, title, turl;
    Long reading_time;

    public StoryModel() {
    }

    public StoryModel(String category, String description, Long reading_time, String text, String title, String turl) {
        this.category = category;
        this.description = description;
        this.reading_time = reading_time;
        this.text = text;
        this.title = title;
        this.turl = turl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getReading_time() {
        return reading_time;
    }

    public void setReading_time(Long reading_time) {
        this.reading_time = reading_time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }
}
