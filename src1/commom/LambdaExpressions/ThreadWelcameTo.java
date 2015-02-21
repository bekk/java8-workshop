package commom.LambdaExpressions;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public class ThreadWelcameTo {

    /*  Defining Methods:
        modifiers return_type  method_name(parameter_list) {
            method body
        }
    */
    public static Runnable runnable = new Runnable() {

        @Override
        public void run() {

            for (int i = 0 ; i < 1 ; i++) {
                System.out.println(
                        "Kjære Bekkere - Velkommen hos workshop Java 8 fra thread [" +
                        Thread.currentThread().getName() +
                        "]");
            }

        }

    };


    /*  Defining lambda expression
        (parameter_list) -> {
            method body
        };
    */
    public static Runnable runnableLambda = () -> {

        for (int i = 0 ; i < 1 ; i++) {
            System.out.println(
                    "Kjære Bekkere - Velkommen hos workshop Java 8 fra thread [" +
                    Thread.currentThread().getName() +
                    "]");
        }

    } ;

}
