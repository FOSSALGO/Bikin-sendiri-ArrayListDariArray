package bikin;

public class ArrayList {

    private int MAX_SIZE = 10;
    private double[] values = new double[MAX_SIZE];
    private int index = -1;

    public boolean isEmpty() {
        boolean result = false;
        if (index < 0) {
            result = true;
        }
        return result;
    }

    public int size() {
        return index + 1;
    }

    public void add(double v) {
        index++;
        if (index >= MAX_SIZE) {
            MAX_SIZE = MAX_SIZE + 10;
            double[] newValues = new double[MAX_SIZE];
            for (int i = 0; i < values.length; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[index] = v;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= index; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(values[i]);
        }
        sb.append("]");
        String result = sb.toString();
        return result;
    }

}
