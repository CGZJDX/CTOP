
import java.io.IOException;
import java.util.*;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "data/p13.cri";
		Instance inst = new Instance(file);
		inst.m = 4;
		inst.Q = 100;
		inst.T = 100;
		Tabu tabu = new Tabu(inst);
		tabu.solve(1000, 30);
	}

}
