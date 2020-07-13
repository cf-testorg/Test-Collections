package brp.rules.positives;

import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextServices;
import java.beans.beancontext.BeanContextServicesSupport;
import java.beans.beancontext.BeanContextSupport;
import java.util.AbstractCollection;
import java.util.AbstractQueue;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;
import javax.management.relation.RoleList;
import javax.management.relation.RoleUnresolvedList;
import javax.print.attribute.standard.JobStateReasons;

public class ViolationsFields {

    private BeanContext beanContext = new BeanContextSupport();
    private BeanContextServices contextServices = new BeanContextServicesSupport();
    private BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>();
    private BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);
    private List<String> list = new ArrayList<>();
    private NavigableSet<String> navigableSet = new TreeSet<>();
    private Queue<String> queue = new LinkedBlockingDeque<>();
    private Set<String> set = new TreeSet<>();
    private SortedSet<String> sortedSet = new TreeSet<>();
    private TransferQueue<String> transferQueue =  new LinkedTransferQueue<>();
    private AbstractCollection<String> abstractCollection = new ArrayList<>();
    private AbstractQueue<String> abstractQueue = new LinkedBlockingDeque<>();
    private AbstractSequentialList<String> sequentialList = new LinkedList<>();
    private AbstractSet<String> abstractSet = new TreeSet<>();
    private ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
    private ArrayDeque<String> arrayDeque = new ArrayDeque<>();
    private ArrayList<String> arrayList = new ArrayList<>();
    private BeanContextServicesSupport servicesSupport = new BeanContextServicesSupport();
    private BeanContext beanContextSupport = new BeanContextSupport();
    private ConcurrentHashMap.KeySetView<String, Boolean> keySet = ConcurrentHashMap.newKeySet();
    private ConcurrentLinkedDeque<String> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
    private ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
    private ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();
    private CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    private CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
    private DelayQueue<MyDelayed> delayQueue = new DelayQueue<>();
    private EnumSet<MyEnum> enums = EnumSet.of(MyEnum.TEST);
    private HashSet<String> hashSet = new HashSet<>();
    private JobStateReasons reasons = new JobStateReasons();
    private LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>();
    private LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
    private LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    private LinkedList<String> linkedList = new LinkedList<>();
    private LinkedTransferQueue<String> linkedTransferQueue = new LinkedTransferQueue<>();
    private PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
    private PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    private RoleList roleList = new RoleList();
    private RoleUnresolvedList roleUnresolvedList = new RoleUnresolvedList();
    private Stack<String> stack = new Stack<>();
    private SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
    private TreeSet<String> treeSet = new TreeSet<>();
    private Vector<String> vector = new Vector<>();
    private Collection<String> collection = new ArrayList<>();

    public void violations(){
        if (beanContext.size()  == 0) {
            System.out.println("is empty");
        }

        if (contextServices.size() == 0) {
            System.out.println("is empty");
        }

        if (blockingDeque.size() == 0) {
            System.out.println("is empty");
        }

        if (blockingQueue.size() == 0) {
            System.out.println("is empty");
        }

        if (list.size() == 0){
            System.out.println("is empty");
        }

        if ((navigableSet.size() == 0)) {
            System.out.println("is empty");
        }

        if (queue.size() == 0){
            System.out.println("is empty");
        }

        if (set.size() == 0){
            System.out.println("is empty");
        }

        if (sortedSet.size() == 0){
            System.out.println("is empty");
        }

        if (transferQueue.size() == 0){
            System.out.println("is empty");
        }

        if (abstractCollection.size() == 0){
            System.out.println("is empty");
        }

        if (abstractQueue.size() == 0){
            System.out.println("is empty");
        }

        if (sequentialList.size() == 0){
            System.out.println("is empty");
        }

        if (abstractSet.size() == 0){
            System.out.println("is empty");
        }

        if (arrayBlockingQueue.size() == 0){
            System.out.println("is empty");
        }

        if (arrayDeque.size() == 0){
            System.out.println("is empty");
        }

        if (arrayList.size() == 0){
            System.out.println("is empty");
        }

        if (servicesSupport.size() == 0){
            System.out.println("is empty");
        }

        if (beanContextSupport.size() == 0){
            System.out.println("is empty");
        }

        if (keySet.size() == 0){
            System.out.println("is empty");
        }

        if (concurrentLinkedDeque.size() == 0){
            System.out.println("is empty");
        }

        if (concurrentLinkedQueue.size() == 0){
            System.out.println("is empty");
        }

        if (concurrentSkipListSet.size() == 0){
            System.out.println("is empty");
        }

        if (copyOnWriteArrayList.size() == 0){
            System.out.println("is empty");
        }

        if (copyOnWriteArraySet.size() == 0){
            System.out.println("is empty");
        }

        if (delayQueue.size() == 0){
            System.out.println("is empty");
        }

        if (enums.size() == 0){
            System.out.println("is empty");
        }

        if (hashSet.size() == 0){
            System.out.println("is empty");
        }

        if (reasons.size() == 0){
            System.out.println("is empty");
        }

        if (linkedBlockingDeque.size() == 0){
            System.out.println("is empty");
        }

        if (linkedBlockingQueue.size() == 0){
            System.out.println("is empty");
        }

        if (linkedHashSet.size() == 0){
            System.out.println("is empty");
        }

        if (linkedList.size() == 0){
            System.out.println("is empty");
        }

        if (linkedTransferQueue.size() == 0){
            System.out.println("is empty");
        }

        if (priorityBlockingQueue.size() == 0){
            System.out.println("is empty");
        }

        if (priorityQueue.size() == 0){
            System.out.println("is empty");
        }

        if (roleList.size() == 0){
            System.out.println("is empty");
        }

        if (roleUnresolvedList.size() == 0){
            System.out.println("is empty");
        }

        if (stack.size() == 0){
            System.out.println("is empty");
        }

        if (synchronousQueue.size() == 0){
            System.out.println("is empty");
        }

        if (treeSet.size() == 0){
            System.out.println("is empty");
        }

        if (vector.size() == 0){
            System.out.println("is empty");
        }

        if (collection.size() == 0){
            System.out.println("is empty");
        }
    }
}
