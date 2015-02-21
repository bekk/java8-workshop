package commom.Location;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public enum TypeOfFile {
    JAVA(".java");

    String extension;

    TypeOfFile(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString(){
        return extension;
    }

}
