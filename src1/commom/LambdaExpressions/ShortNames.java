package commom.LambdaExpressions;

import java.util.Comparator;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public class ShortNames {

    /*  Defining Methods:
        modifiers return_type  method_name(parameter_list) {
            method body
        }
    */
    public static Comparator<String> comp = new Comparator<String>() {

        @Override
        public int compare(String s1, String s2) {

            return s1.compareTo(s2);

        }

    };

    /*  Defining lambda expression
        (parameter_list) -> {
            method body
        };
    */
    public static Comparator<String> compLambda =
            (String s1, String s2) -> {
                return s1.compareTo(s2);
            };

    public static Comparator<String> compLambdaSimplify =
            (s1, s2) -> s1.compareTo(s2);

}