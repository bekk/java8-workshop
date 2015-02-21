package commom.Location;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public enum PathName {
    WORKINGDIR(System.getProperty("user.dir").concat("\\src1\\LambdaExpressions"));

    String dirLocation;

    PathName(String dirLocation) {
        this.dirLocation = dirLocation;
    }

    @Override
    public String toString(){
        return dirLocation;
    }
}
