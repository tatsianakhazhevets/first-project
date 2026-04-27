package no_more_manual_level_up_automation.mock_interview;

public class Main {


    public static void main(String[] args) {
        ReportSystem rs = new ReportSystem();
        Report pdf = new PDF("\"Sales in March\"");
        Report excel = new Excel("\"Salaries\"");
        Report html = new HTML("\"Static of web site\"");
        rs.addReport(pdf);
        rs.addReport(excel);
        rs.addReport(html);
        rs.generateReports();
    }
}