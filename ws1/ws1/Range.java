package ws1;

public class Range {

    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
        if (end <= start) {
            this.start = end;
            this.end = start;
        }

    }

    public Range(int range) {
        start = 0;
        end = range;
    }

    public int getStart() {
        return start;
    }

    private void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    private void setEnd(int end) {
        this.end = end;
    }

    public int length() {

        return end - start;
    }

}
