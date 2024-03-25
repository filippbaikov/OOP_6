package dip1.model.util;

import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.Reportable;

import java.util.List;

public class ReportManager   {
    Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }


    public void toOutput(List<ReportItem> items) {
            reportable.output(items);

    }
}
