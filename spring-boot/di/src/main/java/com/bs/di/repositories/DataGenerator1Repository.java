package com.bs.di.repositories;

import com.bs.di.classes.ReportData;
import com.bs.di.interfaces.BaseDataGenerator;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DataGenerator1Repository implements BaseDataGenerator {

    @Override
    public List<ReportData> generateFakeData() {
        return List.of(
            new ReportData("Goku Super Saiyan 1", 1.0),
            new ReportData("Goku Super Saiyan 2", 2.0),
            new ReportData("Goku Super Saiyan 3", 3.0),
            new ReportData("Gohan Super Saiyan 2", 2.0)
        );
    }

}
