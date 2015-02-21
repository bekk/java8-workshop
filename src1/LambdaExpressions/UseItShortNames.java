package LambdaExpressions;

import commom.LambdaExpressions.ShortNames;

import static commom.Show.ListObjects.ShortNamesOfFagGroupJava;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public class UseItShortNames {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Short names of fag group Java");
        System.out.println(" * comp - Old way");
        ShortNamesOfFagGroupJava(ShortNames.comp);

        System.out.println("\n * comp Lambda - New way");
        ShortNamesOfFagGroupJava(ShortNames.compLambda);

        System.out.println("\n * comp Lambda - New way");
        ShortNamesOfFagGroupJava(ShortNames.compLambdaSimplify);
    }

}
