package entity;

public class Book extends Material{

    public Book(){}

    public Book(String title){
        super(title);
    }

    @Override
    public String materialInfo(){
        return "Título do livro: " + getTitle();
    }
}
