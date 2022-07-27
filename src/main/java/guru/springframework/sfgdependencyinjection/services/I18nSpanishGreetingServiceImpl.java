package guru.springframework.sfgdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"ESP", "default"})
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ESP";
    }
}
