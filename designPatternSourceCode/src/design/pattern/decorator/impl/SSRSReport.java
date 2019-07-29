package design.pattern.decorator.impl;

import design.pattern.decorator.Report;

/**
 * SSRS报表
 */
public class SSRSReport implements Report {

    @Override
    public String generateReport() {
        return "Generate Report using Sql Server Report Service!";
    }
}
