package commom.LambdaExpressions;

import commom.Location.TypeOfFile;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public class FilesWorkDirFilter {

    /*  Defining Methods:
        modifiers return_type  method_name(parameter_list) {
            method body
        }
    */
    public static FileFilter filter = new FileFilter() {

        @Override
        public boolean accept(File pathname) {

            return pathname.getName().endsWith(TypeOfFile.JAVA.toString());

        }

    };

    /*  Defining lambda expression
        (parameter_list) -> {
            method body
        };
    */
    public static FileFilter filterLambda = (File pathname) -> {
        return pathname.getName().endsWith(TypeOfFile.JAVA.toString());
    };

    public static FileFilter filterLambdaSimplify =
            (pathname) -> pathname.getName().endsWith(TypeOfFile.JAVA.toString());

}
