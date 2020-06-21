package Learning;

import com.sun.tools.attach.AgentInitializationException;

public class Inner {
    int age=5;
    private int years;

    public Inner() {
    }

    public class InnerInt{
        int ages;

        public InnerInt() {
            ages=age;
        }
    }
}
