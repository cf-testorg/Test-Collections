package brp.rules.positives;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class MyDelayed implements Delayed {

    @Override public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override public int compareTo(Delayed o) {
        return 0;
    }
}
