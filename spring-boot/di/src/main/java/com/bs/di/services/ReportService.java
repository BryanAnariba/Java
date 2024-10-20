package com.bs.di.services;

import com.bs.di.classes.ReportData;
import com.bs.di.interfaces.BaseDataGenerator;
import com.bs.di.interfaces.CustomQualifier;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    
    // @Autowired
    private BaseDataGenerator baseDataGenerator;
    
    // Con @Autowired no hay necesidad del constructor asi que lo comentamos
    // Cualquiera de los dos constructores sirve solo que un Qualifier es custom y lo creamos nosotros, yo me iria por el primero para ser exacto
//    public ReportService (@Qualifier("dataGenerator2Repository") BaseDataGenerator baseDataGenerator) {
//        this.baseDataGenerator = baseDataGenerator;
//    }
    
    public ReportService (@CustomQualifier("dataGenerator1Repository") BaseDataGenerator baseDataGenerator) {
        this.baseDataGenerator = baseDataGenerator;
    }
    
    public void generateReportData() {
        List<ReportData> reportDataList = this.baseDataGenerator.generateFakeData();
        if (reportDataList != null) {
            for (ReportData rd: reportDataList) {
                System.out.println(rd);
            }
        } else {
            System.out.println("Data not found!");
        }
    }    
}
