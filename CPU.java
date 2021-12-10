package bgu.spl.mics.application.objects;

import java.util.Collection;

/**
 * Passive object representing a single CPU.
 * Add all the fields described in the assignment as private fields.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */
public class CPU {
    private int cores;
    private Collection<DataBatch> dataB;
    private Cluster c;

    public CPU(int cores, Cluster c){

    }
    /**
     * @param d - the data to be processed  *
     * @pre d != null
     * @post dataB size == dataB size @pre +1
     */
    public void addTodata(DataBatch d){

    }
    /**
     * @pre dataB size > 0
     * @post dataB size == dataB size @pre - 1
     */
    public int Process(){//process one data patch from the collection and sends it to the Cluster
        return 0;//TO DO
    }

    public int getDataSize(){
        return this.dataB.size();
    }
    public int getCores(){
        return this.cores;
    }

}
