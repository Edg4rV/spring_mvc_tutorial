package noxml

import org.springframework.context.annotation.AnnotationConfigApplicationContext

class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class)


        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class)

        println coach.getEmail()

        println coach.getTeam()




        println coach.getDailyWorkout()


        println coach.getDailyFortune()

        context.close()


    }
}
