package com.bs.di.interfaces;

import com.bs.di.classes.ReportData;
import java.util.List;

public interface BaseDataGenerator {
    
    List<ReportData> generateFakeData();
}
