public class OX {
    private String[][] table = {
            {" " ,"0" ,"1" ,"2"} ,
            {"0" ,"-" ,"-" ,"-"} ,
            {"1" ,"-" ,"-" ,"-"} ,
            {"2" ,"-" ,"-" ,"-"} ,
    };
    private String player;
    private int countX;
    private int countO;
    private int countDraw;
    private int turnCount;

    public OX() {
        player = "X";
        countX = 0;
        countO = 0;
        countDraw = 0;
    }

    public String getTableString() {
        String result="";
        for( int row=0; row<table.length; row++ ) {
            for( int col=0; col<table[row].length; col++ ) {
                result = result + table[row][col];
            }
            result = result + "\n";
        }
        return result;
    }

    public String getCurrentPlayer() {
        return player;
    }

    public int getCountO() {
        return countO;
    }

    public int getCountX() {
        return countX;
    }

    public int getCountDraw() {
        return countDraw;
    }

    public boolean put(int col, int row) {
        if(!table[row+1][col+1].equals("-")) {
            return false;
        }
        table[row+1][col+1] = getCurrentPlayer();
        turnCount++;
        return true;
    }

    public void switchPlayer() {
        if( player == "X" ) {
            player = "O";
        } else {
            player = "X";
        }
    }

    public String get(int col, int row) {
        return table[row+1][col+1];
    }
    public boolean checkWin(int col, int row) {

        /*
         * Check col
         */
        boolean checkCol = true;
        for( int i=0; i<3; i++) {
            if( !table[i+1][col+1].equals(getCurrentPlayer()) ) {
                checkCol = false;
                break;

            }
        }
        if(checkCol) {
            return true;
        }


        /*
         * Check row
         */
        boolean checkRow = true;
        for( int i=0; i<3; i++) {
            if (!table[row + 1][i + 1].equals(getCurrentPlayer())) {
                checkRow = false;
                break;
            }
        }
        if(checkRow) {
            return true;
        }

        boolean checkDiagEw = true;
        for(int i=0; i<3; i++) {
            if (!table[i + 1][i + 1].equals(getCurrentPlayer())) {
                checkDiagEw = false;
                break;
            }
        }
        if(checkDiagEw) {
            return true;
        }


        boolean checkDiagSw = true;
        for(int i=0; i<3; i++) {
            if (!table[3-i][i + 1].equals(getCurrentPlayer())) {
                checkDiagSw = false;
                break;
            }
        }
        if(checkDiagSw) {
            return true;
        }
        return false;
    }


    public int getTurnCount() {
        return turnCount;
    }
}
