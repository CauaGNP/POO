package entity;

import exceptions.InvalidNumberException;

public abstract class Image {
    public int id;
    private int height;
    private int width;

    public Image(){}

    public Image(int id, int height, int width){
        this.id = id;
        this.height = height;
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        if(width <= 0){
            throw new InvalidNumberException("A largura deve ser maior que zero");
        }
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        if(width <= 0){
            throw new InvalidNumberException("A altura deve ser maior que zero");
        }
        this.height = height;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int calculateSize(){
        return width * height;
    }

    public abstract String process();
}
