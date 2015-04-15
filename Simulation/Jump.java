package Program;


import java.util.*;

import Simulation.Memory;

/**
 * 
 */
public class Jump implements Instruction {
	int index;
	
    /**
     * 
     */
    public Jump() {
    }

    /**
     * @param int index
     */
    public Jump(int index) {
        this.index = index;
    }

    /**
     * @param Counter c 
     * @param Memory m
     */
    public void execute(Counter c, Memory m) {
        c.setCounter(c.getValue()-index);
        
    }

}