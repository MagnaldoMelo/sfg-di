package mmelo.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"BR", "default"})
@Service("I18nService")
public class I18nPortugueseService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Olá!";
    }
}
