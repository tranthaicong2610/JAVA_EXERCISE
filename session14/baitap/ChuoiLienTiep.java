package session14.baitap;

public class ChuoiLienTiep {
    public String timChuoi(String s) {
        String resString = "";
        int indexStart = 0, indexEnd = 0;
        int count = 1, res = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > s.charAt(j - 1)) {
                    count++;
                } else break;
            }
            if (count > res) {
                res = count;

                indexStart = i;
                indexEnd = i + count;
                i = i + count - 1;
            } //12313489123456 //abdabcsj

        }
        for (int i = indexStart; i < indexEnd; i++) resString += s.charAt(i);

        return resString;
    }
}
