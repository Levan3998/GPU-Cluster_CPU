package bgu.spl.mics.application.objects;

import java.util.LinkedList;

public class Statistics {
    private LinkedList<String> model_Names;
    private int data_processed;
    private int CPU_time_units;
    private int GPU_time_units;

    public Statistics(){
        model_Names=new LinkedList<String>();
        data_processed=0;
        CPU_time_units=0;
        GPU_time_units=0;
    }
    public LinkedList<String> getModel_Names(){
        return  model_Names;
    }
    public int getData_processed(){
        return data_processed;
    }

    public int getCPU_time_units() {
        return CPU_time_units;
    }

    public int getGPU_time_units() {
        return GPU_time_units;
    }
    public void addToCpuUnits(int time_untis){
        CPU_time_units += time_untis;
    }
    public void addToGpuUnits(int time_untis){
        GPU_time_units += time_untis;
    }
    public void addToDataProcessed(int data){
        data_processed += data;
    }
    public void addName(String name){
        model_Names.add(name);
    }
}
