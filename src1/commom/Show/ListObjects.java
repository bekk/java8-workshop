package commom.Show;

import commom.Location.PathName;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public class ListObjects {

    public static void FilesInWorkDirByFilter(FileFilter filter) {

        File dir = new File(PathName.WORKINGDIR.toString());

        File[] files = dir.listFiles(filter);

        for (File f : files) {
            System.out.println(f);
        }

    }

    public static void ShortNamesOfFagGroupJava(Comparator<String> comp) {
        List<String> namesOfFagGroupJava = Arrays.asList(
                "Henrik Wingerei",
                "Robert Larsen",
                "Pedro Alves",
                "Geir Nygård",
                "Øyvind Hagen",
                "Frode Nerbråten",
                "Gustav Karlsson",
                "Joril Andersen");

        Collections.sort(namesOfFagGroupJava, comp);

        int index = 1;
        for(String s : namesOfFagGroupJava) {
            System.out.print(
                    namesOfFagGroupJava.size() != index++ ? (s + ", ") : s
            );


        }
    }

}
