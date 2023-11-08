package week9;

public class Location_09_13 {
    int row;
    int column;
    double maxValue;

    Location_09_13() {

    }

    Location_09_13(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }
}
