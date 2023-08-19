package ds;
import java.util.Comparator;

class SortByDescending implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        // Compare o2 to o1 to achieve descending order based on the first character
        return o2.charAt(0) - o1.charAt(0);
    }
}
