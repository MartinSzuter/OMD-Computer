package Simulation;


import java.util.*;

import Program.Counter;
import Program.Instruction;
import Program.Program;

/**
 * 
 */
public class Computer {
	Counter counter;
	int counterInitial;
	Memory memory;
	Program program;
	Instruction[] instructions;
	/**
	 * 
	 */
	public Computer(Memory memory) {
		this.memory=memory;
		counter = new Counter();
	}

	/**
	 * @param Program 
	 * @return
	 */
	public void load(Program program) {
		instructions = (Instruction[]) program.fetchInstructions().toArray();
		counter.setCounter(instructions.length);
		counter.setInitial(instructions.length);
		counterInitial = instructions.length;
	}

	/**
	 * @return
	 */
	public void run() {
		while (counter.getValue() > 0) {
			instructions[counterInitial-counter.getValue()].execute(counter, memory);
		}
	}
}
