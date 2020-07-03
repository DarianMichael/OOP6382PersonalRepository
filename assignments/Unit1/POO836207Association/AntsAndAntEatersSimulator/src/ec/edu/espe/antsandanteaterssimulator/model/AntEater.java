package ec.edu.espe.antsandanteaterssimulator.model;

/**
 *
 * @author DARIAN
 */
public class AntEater {
    
    private Cell position;
    private int antEaterCounter;
    private int runCounter;
    private StateAntEater stateAntEater;

    public AntEater(Cell position, int antEaterCounter, int runCounter, StateAntEater stateAntEater) {
        this.position = position;
        this.antEaterCounter = antEaterCounter;
        this.runCounter = runCounter;
        this.stateAntEater = stateAntEater;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getAntEaterCounter() {
        return antEaterCounter;
    }

    public void setAntEaterCounter(int antEaterCounter) {
        this.antEaterCounter = antEaterCounter;
    }

    public int getRunCounter() {
        return runCounter;
    }

    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    public StateAntEater getStateAntEater() {
        return stateAntEater;
    }

    public void setStateAntEater(StateAntEater stateAntEater) {
        this.stateAntEater = stateAntEater;
    }
    
    public void run(){
        
    }
}
