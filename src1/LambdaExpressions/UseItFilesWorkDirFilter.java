package LambdaExpressions;

import commom.LambdaExpressions.FilesWorkDirFilter;

import static commom.Show.ListObjects.FilesInWorkDirByFilter;

/**
 * Created by Pedro Alves on 18.02.2015.
 */
public class UseItFilesWorkDirFilter {

    public static void main(String[] args) {

        System.out.println("List files in work directory by type of file");
        System.out.println("* filter - Old way");
        FilesInWorkDirByFilter(FilesWorkDirFilter.filter);

        System.out.println("* filter Lambda - New way");
        FilesInWorkDirByFilter(FilesWorkDirFilter.filterLambda);

        System.out.println("* filter Lambda Simplify - New way");
        FilesInWorkDirByFilter(FilesWorkDirFilter.filterLambdaSimplify);

    }

}
