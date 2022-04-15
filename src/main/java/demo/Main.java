package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring.xml");

        /*ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);*/
        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
        Nurse nurse = (Nurse) applicationContext.getBean("nurse");
        nurse.assist();

        //Loosely coupled we can use objects when it required
        Staff doctorStaff = applicationContext.getBean(Doctor.class);
        doctorStaff.assist();
        Staff nurseStaff = applicationContext.getBean(Nurse.class);
        nurseStaff.assist();

        MaleNurse maleNurse = applicationContext.getBean(MaleNurse.class);
        maleNurse.assist();
    }
}
