import java.util.Arrays;

public class KnightsProblemState extends State {
    Queen [] queens ;
    Knight [] knights ;

    public KnightsProblemState(byte[][] board , Queen[] queens,Knight [] knights) {
        super(board);
        this.queens = queens;
        this.knights = knights;
    }
//    clone state
    public KnightsProblemState(KnightsProblemState  kpState) {
super(kpState.state);

        Knight[] clonedKnights = new Knight[kpState.knights.length];
        for(int i = 0;i<clonedKnights.length;i++)
            clonedKnights[i] = new Knight(kpState.knights[i]);
        Queen[] clonedQueens = new Queen[kpState.queens.length];
        for(int i = 0;i<clonedQueens.length;i++)
            clonedQueens[i] = new Queen(kpState.queens[i]);

        this.queens = clonedQueens;
        this.knights = clonedKnights;
    }

@Override
public String toString(){
        String boardString="";
        for(int i =0; i<state.length;i++){
            for (int j =0;j<state.length;j++)
                boardString+=" "+state[i][j];
            boardString+="\n";
        }
        String knightsStings= "";
        for(Knight k : knights)
            knightsStings+=k.toString()+"\n";
    String queensStings= "";
    for(Queen q : queens)
        queensStings+=q.toString()+"\n";
        return String.format(
                "grid:\n %s \n ,knights: %s ,\n queens:%s",boardString,knightsStings,queensStings
        );
}
    @Override
    public int compareTo(State o) {
        // goal state
        return this.queens.length;
    }
}
