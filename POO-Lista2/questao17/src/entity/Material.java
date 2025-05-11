package entity;

import exceptions.ValueTitleEmptyException;

public abstract class Material {
    private String title;

    public Material() {}

    public Material(String title) {
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()){
            throw new ValueTitleEmptyException();
        }
        this.title = title;
    }

    public abstract String materialInfo();
}
