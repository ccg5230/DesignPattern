package design.pattern.decorator;

/**
 * 装饰类父类
 */
public class ReportGenerator implements Report {
    //持有接口
    private Report report;
    public ReportGenerator(Report report){
        this.report = report;
    }

    @Override
    public String generateReport() {
        return report.generateReport();
    }

}
