import java.util.*;

public class DesignHashSet705 {
    public boolean[] arr = new boolean[1000001];

    public DesignHashSet705() {
        Arrays.fill(arr, false);
    }

    public void add(int key) {
        if (!arr[key]) {
            arr[key] = true;
        }
    }

    public void remove(int key) {
        arr[key] = false;
    }

    public boolean contains(int key) {
        return arr[key];
    }

}
