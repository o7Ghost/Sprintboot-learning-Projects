package springdemoannotation.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = new String[] { "Fortune1", "Fortune2", "Fortune3" };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int idx = random.nextInt(data.length);
        return data[idx];
    }

}
