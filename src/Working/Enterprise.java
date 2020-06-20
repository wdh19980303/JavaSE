package Working;

import java.util.zip.CheckedOutputStream;

public abstract class Enterprise {
    public abstract void code();

    public final void getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(start-end);
    }


}
