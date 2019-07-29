package design.pattern.decorator.impl;

import design.pattern.decorator.Report;

/**
 * 水晶报表
 */
public class CrystalReport implements Report {

    @Override
    public String generateReport() {
        return "Generate Report using Crystal Report！";
    }

}
