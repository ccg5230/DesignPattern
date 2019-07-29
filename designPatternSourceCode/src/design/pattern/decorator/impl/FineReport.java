package design.pattern.decorator.impl;

import design.pattern.decorator.Report;

/**
 * Fine Report报表
 */
public class FineReport implements Report {

    @Override
    public String generateReport() {
        return "Generate Report using Fine Report!";
    }

}
