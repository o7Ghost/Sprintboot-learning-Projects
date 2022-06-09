package springdemoannotation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> inside default constructor.");
    }

    // @Autowired
    // public TennisCoach(FortuneService theFortuneService) {
    // fortuneService = theFortuneService;
    // }

    // @Autowired
    // public void setFortuneService(FortuneService theFortuneService) {
    // System.out.println(">> inside default setter method.");
    // fortuneService = theFortuneService;
    // }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
