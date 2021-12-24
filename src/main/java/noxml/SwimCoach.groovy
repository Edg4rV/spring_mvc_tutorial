package noxml

import org.springframework.beans.factory.annotation.Value

class SwimCoach implements Coach {

    @Value('${foo.email}')
    String email

    @Value('${foo.team}')
    String team

    FortuneService fortuneService


    SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService
    }

    @Override
    String getDailyWorkout() {
        return "Swim 1000 meters as a warm up."
    }

    @Override
    String getDailyFortune() {
        return fortuneService.getFortune()
    }

    String getEmail() {
        return email
    }

    String getTeam() {
        return team
    }
}
