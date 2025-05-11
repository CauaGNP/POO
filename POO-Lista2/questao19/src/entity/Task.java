package entity;

import exceptions.EmptyValueException;

public abstract class Task {
    private String description;

    public Task (){}

    public Task (String description){
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description == null || description.trim().isEmpty()){
            throw new EmptyValueException("descição");
        }
        this.description = description;
    }

    public abstract String realizeTask();
}
