public class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                count0++;
            } else count1++;
        }

        if (Math.abs(count0 - count1) > 1) {
            return -1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(0);
            } else stringBuilder.append(1);
        }
        String valid0Started = stringBuilder.toString();
        stringBuilder.setLength(0);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(1);
            } else stringBuilder.append(0);
        }

        String valid1Started = stringBuilder.toString();
        int mismatches0 = countMismatches(s, valid0Started);
        int mismatches1 = countMismatches(s, valid1Started);

        return Math.min(mismatches0, mismatches1) / 2;
    }


    private int countMismatches(String s, String sCandidate) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sCandidate.charAt(i)) {
                count++;
            }
        }
        if (count % 2 != 0) {
            return Integer.MAX_VALUE / 2;
        }
        return count;
    }
}
