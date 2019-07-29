package design.pattern.decorator.impl;

import design.pattern.decorator.Report;
import design.pattern.decorator.ReportGenerator;

/**
 * 输出Word报告
 */
public class ExportWordReport extends ReportGenerator {
    public ExportWordReport(Report report) {
        super(report);
    }
    public String generateReport() {
        return super.generateReport() + " Export to Word Format!";
    }
}
