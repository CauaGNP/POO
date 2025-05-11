package entity;
import exceptions.*;

public class PDFExporter implements ExporterReport {

    public PDFExporter(){}

    @Override
    public String exporter(String titulo, String conteudo){
        if(titulo == null || titulo.trim().isEmpty()){
            throw new EmptyStringException("título");
        }
        if(conteudo == null || conteudo.trim().isEmpty()){
            throw new EmptyStringException("conteúdo");
        }
        return "PDF exportado. Título: " + titulo + ", conteúdo: " + conteudo;
    }
}
