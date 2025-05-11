package entity;

import exceptions.EmptyStringException;

public class CSVExporter implements ExporterReport {
    public CSVExporter(){}

    @Override
    public String exporter(String titulo, String conteudo){
        if(titulo == null || titulo.trim().isEmpty()){
            throw new EmptyStringException("título");
        }
        if(conteudo == null || conteudo.trim().isEmpty()){
            throw new EmptyStringException("conteúdo");
        }
        return "CSV exportado. Título: " + titulo + ", conteúdo: " + conteudo;
    }
}
