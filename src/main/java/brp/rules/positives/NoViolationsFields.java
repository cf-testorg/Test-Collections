package brp.rules.positives;

import org.apache.lucene.util.PriorityQueue;

public class NoViolationsFields {

    private final PriorityQueue<String> priorityQueue = new PriorityQueue<String>(10) {
        @Override
        protected boolean lessThan(String a, String b) {
            return false;
        }
    };

    public void violations(){
        if (priorityQueue.size() == 0) {
            System.out.println("is empty");
        }
    }
}
