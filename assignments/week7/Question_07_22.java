package week7;

public class Question_07_22 {
    public static void main(String[] args) {
        char[] chessBoard=new char[64];
        for (int i=0;i<chessBoard.length;i++){
            chessBoard[i]='-';
        }
        printChessBoard(chessBoard);
        placeAQueen(chessBoard);
        printChessBoard(chessBoard);



    }

    private static void placeAQueen(char[] chessBoard) {
        for (int i=0;i<chessBoard.length;i++){
            if(chessBoard[i]=='-'){
                chessBoard[i]='Q';
                //Bu for vezirin sütununu etkisiz hale getiriyor
                for(int j=0;j<64;j++){
                    if(i!=j&&(j%8==i%8)){
                        chessBoard[j]='X';
                    }
                }
                //Bu for vezirin satırını etkisiz hale getiriyor
                for(int j=(i-(i%8));j<i+(8-i%8);j++){
                    if(j!=i){
                        chessBoard[j]='X';
                    }
                }
                //Bu for vezirin KB'den GD'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j<64;j+=9){
                    if(j!=i){
                        chessBoard[j]='X';
                    }
                }
                //Bu for vezirin GD'den KB'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j>=0;j-=9){
                    if(j!=i){
                        chessBoard[j]='X';
                    }
                }
                //Bu for vezirin KD'dan GB'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j<64;j+=7){
                    if(j!=i){
                        chessBoard[j]='X';
                    }
                }
                //Bu for vezirin GD'den KB'ya çaprazlarını etkisiz hale getiriyor
                for(int j=i;j>=0;j-=7){
                    if(j!=i){
                        chessBoard[j]='X';
                    }
                }
                return;

            }


        }

    }

    public static void printChessBoard(char[] array){
        for (int i = 0; i < array.length; i++) {
            if(i%8==0&&i!=0){
                System.out.println();
            }
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
    }


}
