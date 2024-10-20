package com.bs.di;

import com.bs.di.services.ReportService;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {

        /*
            BEANS: son objetos que spring maneja por ti
            IoC Inversion de Control: 
            DI:
        */
        // DI sin spring, a pura lija
        var context = SpringApplication.run(DiApplication.class, args);
        
        // Obtenemos todos los beans, veras que si anotas un repositorio con @Repository o service con @Service saldra ahi
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        
        // Aqui estoy llamando a un servicio pero tiene dos repos iguales osea dos beans iguales, aqui es donde uso qualifier para implementar el que quiero, para ver codigo ir a ReportService
        var report = context.getBean(ReportService.class);
        report.generateReportData();
        
       
//        BaseDataGenerator baseDataGenerator = new DataGenerator1Repository();
//        ReportService reportService = new ReportService(baseDataGenerator);
//        reportService.generateReportData();
    }

}
