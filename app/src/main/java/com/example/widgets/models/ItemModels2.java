package com.example.widgets.models;

public class ItemModels2 {
    String title;
    String description;

    public ItemModels2(String title, String description, int imageId) {
        this.title = title;
        this.description = description;
        ImageId = imageId;
    }

    public ItemModels2() {
        title = "TITLE";
        description = "Content Description...";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    int ImageId;
}
