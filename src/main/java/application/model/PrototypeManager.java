package application.model;


import application.model.products.Queueable;

import java.util.ArrayList;

public class PrototypeManager {
    private static PrototypeManager manager;
    private ArrayList<Queueable> prototyes;
    private PrototypeManager(){}
    public PrototypeManager getManager(){
        if(manager == null) manager = new PrototypeManager();
        return manager;
    }
    public void readFiles() {

    }

    public void addPrototype(Queueable j){
        prototyes.add(j);
    }
    public Queueable getPrototype(int x){
        return prototyes.get(x);
    }
}


