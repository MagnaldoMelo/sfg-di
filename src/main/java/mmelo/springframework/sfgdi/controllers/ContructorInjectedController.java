package mmelo.springframework.sfgdi.controllers;

import mmelo.springframework.sfgdi.services.GreetingService;

public class ContructorInjectedController {
    private final GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
