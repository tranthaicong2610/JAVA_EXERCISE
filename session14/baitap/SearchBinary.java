package session14.baitap;

public class SearchBinary {

    public int searchBinary(int[] list, int low, int high, int key) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If found at mid, then return it
            if (list[mid] == key)
                return mid;

            // Search the left half
            if (list[mid] > key)
                return searchBinary(list,  low, mid - 1,key);

            // Search the right half
            return searchBinary(list,  mid + 1, high,key);
        }

        return -1;

    }
}
