package entity;

public class RepostSystem {
    public RepostSystem(){}

    public String exportReport(ExporterReport export, String title, String content){
        String RExport = export.exporter(title, content);

        return RExport;
    }
}
