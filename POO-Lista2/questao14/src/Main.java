import entity.*;

public class Main {
    public static void main(String[] args) {
        ExporterReport pdf = new PDFExporter();
        ExporterReport csv = new CSVExporter();
        ExporterReport xml = new XMLExporter();

        RepostSystem repost = new RepostSystem();

        System.out.println(repost.exportReport(pdf, "Currículo", "curriculo escolar"));
        System.out.println(repost.exportReport(csv, "Currículo", "curriculo escolar"));
        System.out.println(repost.exportReport(xml, "Currículo", "curriculo escolar"));
    }
}