package brp.rules.positives;

import org.apache.lucene.util.PriorityQueue;

public class NoViolationsMethod {

    public void violations(PriorityQueue<String> priorityQueue){
        if (priorityQueue.size() == 0) {
            System.out.println("is empty");
        }
    }
}
