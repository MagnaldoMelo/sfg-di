package mmelo.springframework.sfgdi.controllers;

import mmelo.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "HelloWorld!!! - Primary";
    }
}
