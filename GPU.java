package bgu.spl.mics.application.objects;

import bgu.spl.mics.Event;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Passive object representing a single GPU.
 * Add all the fields described in the assignment as private fields.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */
public class GPU {
    /**
     * Enum representing the type of the GPU.
     */
    enum Type {RTX3090, RTX2080, GTX1080}

    private Type type;
    private Model model;
    private Cluster cluster;
    private int avData;
    private LinkedList<DataBatch> pData;
    private LinkedList<DataBatch> uData;

    public GPU(){}

    public GPU(Type t,Cluster c){
        this.type=t;
        this.cluster=c;
        this.model=null;
        if(t == Type.RTX3090)
            avData = 32;
        if(t == Type.RTX2080)
            avData = 16;
        if(t == Type.GTX1080)
            avData = 8;


    }
    /**
     * @param m - the Model need to be handled   *
     * @pre m != null && model==null
     * @pre uData size == 0
     * @post model != null
     * @post uData size > 0
     */
    public void handleEvent(Model m){//receives the model needs to be processed and divides the data into batches
        model=m;
        Data toPro = m.getData();
        int size = toPro.getSize();
        for (int i =1 ; i <= size ; i= i +1000 ){
            uData.add(new DataBatch(toPro,i));
        }
    }

    public int getavData(){
        return avData;
    }

    public int getpDataSize(){
        return pData.size();
    }
    /**
     * @pre uData size > 0
     * @post uData size == uData size @pre - 1
     */
    public void pushBatch(){//push a data batch to the cluster to be proccesed

    }
    /**
     * @pre pData size < avData
     * @post pData size == pData size @pre + 1
     */
    public void recievepData(DataBatch data){//recives proccesed data from cluster

    }
    /**
     * @pre pData size == avData
     * @inv pData size <= avData && pData size >= 0
     * @post returnd list size == avData
     * @post pData size == 0
     */
    public LinkedList<DataBatch> pullTrainedData(){// train all the proccess data and return a list with trained data
    return null;//To do
    }
    /**
     * @post model == null
     */
    public void setToReady(){
        this.model=null;
    }

    public Model getModel() {
     return this.model;
    }

    public int getUdataSize(){
        return this.uData.size();
    }







}
