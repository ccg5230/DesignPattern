package design.pattern.decorator;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *===============================================================================================
 * 场景描述：
 * 系统中最初使用Crystal Report（水晶报表）工具生成报表，并将报表发送给客户端查看，
 * 此时定义一CrystalReport工具类即可完成水晶报表的生成工作。后续报表工具增加SSRS报表（SQL Server Report Service），
 * 此时可定义SSRSReport工具类完成SSRS报表的生成工作；需求接着变更，报表工具需要在发送给客户端（以PDF格式）的同时，
 * 可导出一份Word可编辑版本。对此可定义CrystalReportPDF和CrystalReportWord、SSRSReportPDF、SSRSReportWord四个工具类实现相应的功能。
 *
 * 需求继续变更，报表工具需要在发送给客户端（以Word格式或PDF格式）的同时，可将报表存储到文件服务器（File  System）上。
 * 对此可定义CrystalReportPDF、CrystalReportPDF2FS、CrystalReportWord、CrystalReportWord2FS……。
 *
 * 需求仍然在变更，报表工具增加了Fine Report（帆软报表），要求在输出的同时，存储到FTP服务器上、邮件发送给指定用户，
 * 输出格式需要Excel……
 *
 * 针对此场景，之前的办法很痛苦（通过定义类实现接口），此时可应用装饰器模式。
 */
public interface Report  {
    public String generateReport();
}
