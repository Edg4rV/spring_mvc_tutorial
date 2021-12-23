package noxml

import org.springframework.context.annotation.AnnotationConfigApplicationContext

class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class)


        Coach coach = context.getBean("tennisCoach", Coach.class)

        println coach.getDailyWorkout()


        println coach.getDailyFortune()

        context.close()


    }
}
