package design.pattern.decorator.impl;

import design.pattern.decorator.Report;
import design.pattern.decorator.ReportGenerator;

/**
 * 存储报告到FTP服务器
 */
public class StorageReport2FTP extends ReportGenerator {
    public StorageReport2FTP(Report report) {
        super(report);
    }
    public String generateReport() {
        return super.generateReport() + " Storage Report to FTP Server!";
    }
}
