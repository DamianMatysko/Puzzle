package game;

public class Game {
    int[][] array = new int[4][4];

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public Game() {
        int count=0;
        for (int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                this.array[i][j] = count;
                count++;
            }
        }
    }

    public void printArray() {
        for (int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void swap(int x,int y,int x2,int y2) {
        int swap=array[x][y];
        array[x][y]=array[x2][y2];
        array[x2][y2]=swap;
    }

    public boolean isSwapPossible(int code) {
        
        int x=code % 4; // row
        int y=code / 4;//colum

        if (!((j==x)&&(i==y))&&(Math.abs(j-x)==0||Math.abs(j-x)==1)&&(Math.abs(i-y)==0||Math.abs(i-y)==1)){

        }
    }
}
