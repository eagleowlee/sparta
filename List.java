package CACACA;

import java.util.ArrayList;

public class List {
        private ArrayList<Double> resultList = new ArrayList<Double>();

    public ArrayList<Double> getResultList() {
        return resultList;
    }


    public void addResult(double result) {
        resultList.add(result);
    }

    public ArrayList<Double> removeResult() {
        resultList.remove(0);
        return resultList;
    }

}
