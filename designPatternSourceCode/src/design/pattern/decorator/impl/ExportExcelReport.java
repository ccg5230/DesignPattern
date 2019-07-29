package design.pattern.decorator.impl;

import design.pattern.decorator.Report;
import design.pattern.decorator.ReportGenerator;

/**
 * 输出Excel报告
 */
public class ExportExcelReport extends ReportGenerator {
    public ExportExcelReport(Report report) {
        super(report);
    }
    public String generateReport() {
        return super.generateReport() + " Export to Excel Format!";
    }
}