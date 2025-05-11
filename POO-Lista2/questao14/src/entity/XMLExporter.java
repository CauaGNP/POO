package entity;

import exceptions.EmptyStringException;

public class XMLExporter implements ExporterReport {
    public XMLExporter(){}

    @Override
    public String exporter(String titulo, String conteudo){
        if(titulo == null || titulo.trim().isEmpty()){
            throw new EmptyStringException("título");
        }
        if(conteudo == null || conteudo.trim().isEmpty()){
            throw new EmptyStringException("conteúdo");
        }
        return "XML exportado. Título: " + titulo + ", conteúdo: " + conteudo;
    }
}
