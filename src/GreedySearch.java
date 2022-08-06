import java.util.Comparator;

public class GreedySearch implements Comparator< Node> {
	Boolean fun1 ,fun2;

	public GreedySearch(int i) {
		switch(i){
		case 1: fun1=true;fun2=false;break;
		case 2 : fun1=false;fun2=true;break;
		}
	}

	@Override
	public int compare(Node n1, Node n2) {

		if(fun1){

			return ((KnightsProblemState)n1.myState).queens.length - ((KnightsProblemState)n2.myState).queens.length;
		}

			return n1.depth-n2.depth;
			}
			
			
			
		
		
		
		
		
		
		
		
		
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
