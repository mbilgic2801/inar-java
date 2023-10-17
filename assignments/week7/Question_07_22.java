package week7;

public class Question_07_22 {
    public static void main(String[] args) {
        char[] chessBoard=new char[64];
        int[] queenNumber=new int[1];
        int[] freeSquares=new int[65];
        checkQueenNumber(chessBoard,queenNumber);
        erase(chessBoard,queenNumber,freeSquares);
        while(queenNumber[0]!=8){

            if(freeSquares[0]==-1){
                erase(chessBoard,queenNumber,freeSquares);
            }
            placeAQueen(chessBoard,queenNumber,freeSquares);
            //System.out.println("-------"+freeSquares.length+"------"+freeSquares[0]);
            //printChessBoard(chessBoard,queenNumber[0]);
    }
        System.out.println("-------"+freeSquares.length+"------"+freeSquares[0]);
        printChessBoard(chessBoard,queenNumber[0]);
    }
    public static void checkQueenNumber(char[] chessBoard,int[] queenNumber){
        int counter=0;
        for (int i = 0; i < chessBoard.length; i++) {
            if(chessBoard[i]=='Q'){
                counter++;
            }
        }
        queenNumber[0]=counter;
    }
    public static void erase(char[] chessBoard,int[] queenNumber,int[] freeSquares){
        queenNumber[0]=0;
        freeSquares[0]=64;
        for (int i=0;i<chessBoard.length;i++){
            chessBoard[i]='-';
            freeSquares[i+1]=i;
        }
    }
    public static boolean isNotFull(char[] chessBoard){
        for (int i = 0; i < chessBoard.length; i++) {
            if(chessBoard[i]=='-'){
                return true;
            }
        }
        return false;
    }
    private static void placeAQueen(char[] chessBoard,int[] queenNumber,int[] freeSquares) {
        int freeSquareCounter=0;
        for (int i = 0; i < chessBoard.length ; i++) {
            if(chessBoard[i]=='-'){
                freeSquareCounter++;
            }
        }
        freeSquares[0]=freeSquareCounter;
        for (int i = 0,j=0; i < chessBoard.length; i++) {
                if(chessBoard[i]=='-'){
                    freeSquares[j+1]=i;
                    j++;
                }

        }

                int i=freeSquares[(int)(Math.random()*freeSquares.length)];
                if(chessBoard[i]=='-'){
                chessBoard[i]='Q';
                checkQueenNumber(chessBoard,queenNumber);
                //queenNumber[0]++;
                //Bu for vezirin sütununu etkisiz hale getiriyor
                for(int j=i%8;j<64;j+=8){
                    if(i!=j){
                        chessBoard[j]=' ';
                    }
                }
                //Bu for vezirin satırını etkisiz hale getiriyor
                for(int j=(i-(i%8));j<i+(8-i%8);j++){
                    if(j!=i){
                        chessBoard[j]=' ';
                    }
                }
                //Bu for vezirin KB'den GD'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j<64;j+=9){
                    if(j/8!=8&&j%8!=0) {
                        if (j == i) {
                            chessBoard[j] = 'Q';
                        } else {
                            chessBoard[j] = ' ';
                        }
                    }
                    else{
                        break;
                    }
                }
                //Bu for vezirin GD'den KB'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j>=0;j-=9){
                    if(j/8!=-1&&j%8!=7){
                        if(j==i){
                            chessBoard[j]='Q';
                        }
                        else {
                            chessBoard[j] = ' ';
                        }
                    }
                    else{
                        break;
                    }
                }
                //Bu for vezirin KD'dan GB'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j<64;j+=7){
                    if(j/8!=8&&j%8!=7){
                        if (j == i) {
                            chessBoard[j] = 'Q';
                        } else {
                            chessBoard[j] = ' ';
                        }
                    }
                    else{
                        break;
                    }
                }
                //Bu for vezirin GB'dan KD'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j>=0;j-=7){
                    if(j%8!=0&&j/8!=-1){
                        if (j == i) {
                            chessBoard[j] = 'Q';
                        } else {
                            chessBoard[j] = ' ';
                        }
                    }
                    else {
                        break;
                    }
                }
                return;
            }
                else{
                    return;
                }

    }

    public static void printChessBoard(char[] array,int queenNumber){
        for (int i = 0; i < array.length; i++) {

            if(i%8==0&&i!=0){
                System.out.print("|");
                System.out.println();
            }
            System.out.print("|"+array[i]);
        }
        System.out.println("|");

        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("with "+queenNumber+" queens ");
    }


}
