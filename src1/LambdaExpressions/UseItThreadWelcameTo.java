package LambdaExpressions;

import commom.LambdaExpressions.ThreadWelcameTo;

import static commom.Show.ThreadMsg.WelcameToWorkshop;

/**
 * Created by Pedro Alves on 18.02.2015.
 */
public class UseItThreadWelcameTo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Run thread with welcome message to Java 8 Workshop");
        System.out.println("* runnable - Old way");
        WelcameToWorkshop(ThreadWelcameTo.runnable);

        System.out.println("* runnable Lambda - New way");
        WelcameToWorkshop(ThreadWelcameTo.runnableLambda);

    }

}