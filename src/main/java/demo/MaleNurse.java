package demo;

import org.springframework.stereotype.Component;

@Component
public class MaleNurse implements Staff{

    @Override
    public void assist() {
        System.out.println("Male nurse is assisting");
    }

}
