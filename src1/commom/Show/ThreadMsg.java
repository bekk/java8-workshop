package commom.Show;

/**
 * Created by Pedro Alves on 21.02.2015.
 */
public class ThreadMsg {

    public static void WelcameToWorkshop(Runnable runnable) throws InterruptedException {

        Thread t = new Thread(runnable);

        t.start();

        t.join();
    }

}
