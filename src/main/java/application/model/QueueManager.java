package application.model;

import application.model.products.Queueable;

import java.util.ArrayList;
import java.util.LinkedList;

public class QueueManager {
    private static QueueManager manager;
    private LinkedList<Queueable> queue;
    private QueueManager(){}
    public static QueueManager getManager(){
        return manager;
    }

    public void addToQueue(Queueable j){
        queue.push(j);
    }
    public void popFromQueue(){
        queue.pop();
    }

    public void startQueue(){

    }

    public void skipToNext(){

    }
}
