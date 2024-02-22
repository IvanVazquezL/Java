package Minimax;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    static ArrayList<Object> originalBoard =
            new ArrayList<>(Arrays.asList("X","X","O",3,4,5,6,7,"O"));
            //new ArrayList<>(Arrays.asList("O", 1, "X", "X", 4, "X", 6, "O", "O"));

    static String humanPlayer = "O";
    static String aIPlayer = "X";
    public static void main(String[] args) {


        System.out.println(minimax(originalBoard, aIPlayer));

        for (int i = 0; i < originalBoard.size(); i = i + 3) {
            System.out.printf(originalBoard.get(i) + " " + originalBoard.get(i + 1) + " " + originalBoard.get(i + 2) + "\n");
        }
    }

    public static ArrayList<Integer> emptyIndexes(ArrayList<Object> board) {
        return IntStream.range(0, board.size())
                .filter(i -> board.get(i) instanceof Integer)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static boolean winning(ArrayList<Object> board, String player) {
        Object cell0 = board.get(0);
        Object cell1 = board.get(1);
        Object cell2 = board.get(2);
        Object cell3 = board.get(3);
        Object cell4 = board.get(4);
        Object cell5 = board.get(5);
        Object cell6 = board.get(6);
        Object cell7 = board.get(7);
        Object cell8 = board.get(8);

        if (
            (cell0 == player && cell1 == player && cell2 == player) ||
            (cell3 == player && cell4 == player && cell5 == player) ||
            (cell6 == player && cell7 == player && cell8 == player) ||
            (cell0 == player && cell3 == player && cell6 == player) ||
            (cell1 == player && cell4 == player && cell7 == player) ||
            (cell2 == player && cell5 == player && cell8 == player) ||
            (cell0 == player && cell4 == player && cell8 == player) ||
            (cell2 == player && cell4 == player && cell6 == player)
        ){
            return true;
        } else {
            return false;
        }
    }

    public static Move minimax(ArrayList<Object> newBoard, String player) {
        ArrayList<Integer> availableSpots = emptyIndexes(newBoard);

        // checks for the terminal states such as win, lose, and tie and returning a value accordingly
        if (winning(newBoard, humanPlayer)){
            return new Move(-10);
        }
        else if (winning(newBoard, aIPlayer)){
            return new Move(10);
        }
        else if (availableSpots.size() == 0){
            return new Move(0);
        }

        ArrayList<Move> moves = new ArrayList<>();

        for (int i = 0; i < availableSpots.size(); i++) {
            //create an object for each and store the index of that spot
            Move move = new Move();
            int index = availableSpots.get(i);
            move.setIndex(index);

            // set the empty spot to the current player
            newBoard.set(index, player);

            /*collect the score resulted from calling minimax
            on the opponent of the current player*/
            if (player.equals(aIPlayer)){
                Move result = minimax(newBoard, humanPlayer);
                move.setScore(result.getScore());
            }
            else{
                Move result = minimax(newBoard, aIPlayer);
                move.setScore(result.getScore());
            }

            // reset the spot to empty
            newBoard.set(availableSpots.get(i), move.getIndex());

            // push the object to the array
            moves.add(move);
        }

        // if it is the computer's turn loop over the moves and choose the move with the highest score
        int bestMove = -1;

        if(player.equals(aIPlayer)){
            int bestScore = -10000;
            for(int i = 0; i < moves.size(); i++){
                if(moves.get(i).getScore() > bestScore){
                    bestScore = moves.get(i).getScore();
                    bestMove = i;
                }
            }
        } else {
            // else loop over the moves and choose the move with the lowest score
            int bestScore = 10000;
            for(int i = 0; i < moves.size(); i++){
                if(moves.get(i).getScore() < bestScore){
                    bestScore = moves.get(i).getScore();
                    bestMove = i;
                }
            }
        }

        // return the chosen move (object) from the moves array
        return moves.get(bestMove);
    }
}
