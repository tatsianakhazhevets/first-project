package no_more_manual_level_up_automation.mock_interview;

import java.util.ArrayList;
import java.util.List;

public class ReportSystem {

    private List<Report> reports;

    public ReportSystem() {
        this.reports = new ArrayList<>();
    }

    public void addReport(Report report) {
        reports.add(report);
    }

    public void generateReports() {
        for (Report report : reports) {
            report.generate();
        }
    }
}