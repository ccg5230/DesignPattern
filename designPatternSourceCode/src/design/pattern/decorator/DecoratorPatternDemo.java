package design.pattern.decorator;

import design.pattern.decorator.impl.CrystalReport;
import design.pattern.decorator.impl.ExportExcelReport;
import design.pattern.decorator.impl.ExportWordReport;
import design.pattern.decorator.impl.StorageReport2FTP;

public class DecoratorPatternDemo {

    public static void main(String args[]){
        Report report = new CrystalReport();
        report = new ExportWordReport(report);
        report = new ExportExcelReport(report);
        report = new StorageReport2FTP(report);
        System.out.println(report.generateReport());
    }
}
