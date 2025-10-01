import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findMaximumPerformance' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expense
     *  2. INTEGER_ARRAY performance
     *  3. INTEGER spending_cap
     */
    public static int findMaximumPerformance(List<Integer> expense, List<Integer> performance, int spending_cap) {
        int n = expense.size();
        if (n == 0) return 0;
        long best = 0L;
        for (int i = 0; i < n; ++i) {
            if (expense.get(i) <= spending_cap) {
                best = Math.max(best, (long) performance.get(i));
            }
        }
        int[] exp = new int[n];
        int[] perf = new int[n];
        for (int i = 0; i < n; ++i) {
            exp[i] = expense.get(i);
            perf[i] = performance.get(i);
        }
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; ++i) order[i] = i;
        Arrays.sort(order, (a, b) -> Integer.compare(exp[a], exp[b]));

        long[] sortedExp = new long[n];
        long[] sortedPerf = new long[n];
        for (int i = 0; i < n; ++i) {
            sortedExp[i] = exp[order[i]];
            sortedPerf[i] = perf[order[i]];
        }
        long[] prefixMax = new long[n];
        for (int i = 0; i < n; ++i) {
            prefixMax[i] = (i == 0) ? sortedPerf[0] : Math.max(prefixMax[i - 1], sortedPerf[i]);
        }
        for (int j = 0; j < n; ++j) {
            long remaining = (long) spending_cap - sortedExp[j];
            if (remaining < 0) continue;
            int idx = upperBound(sortedExp, remaining) - 1; 
            int iMax = Math.min(idx, j - 1); 
            if (iMax >= 0) {
                best = Math.max(best, sortedPerf[j] + prefixMax[iMax]);
            }
        }

        return (int) best;
    }

    private static int upperBound(long[] arr, long key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (arr[m] <= key) l = m + 1;
            else r = m;
        }
        return l;
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        // Robust token parsing: extracts all integers from stdin (works with lines like
        // "expense[] = [4, 6, 5, 7, 1, 6]" or plain space-separated lists)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<Long> tokens = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;
            // split on anything that is not a digit or minus sign (handles labels and punctuation)
            String[] parts = line.split("[^0-9-]+");
            for (String p : parts) {
                if (p.length() == 0) continue;
                try {
                    tokens.add(Long.parseLong(p));
                } catch (NumberFormatException ignored) {}
            }
        }
        if (tokens.size() == 0) {
            System.out.println(0);
            return;
        }

        int idx = 0;
        // Expecting: n, then n expense values, then n performance values, then spending_cap
        int n = tokens.get(idx++).intValue();

        List<Integer> expense = new ArrayList<>();
        for (int i = 0; i < n && idx < tokens.size(); ++i) {
            expense.add(tokens.get(idx++).intValue());
        }

        List<Integer> performance = new ArrayList<>();
        for (int i = 0; i < n && idx < tokens.size(); ++i) {
            performance.add(tokens.get(idx++).intValue());
        }

        int spending_cap = 0;
        if (idx < tokens.size()) spending_cap = tokens.get(idx++).intValue();

        // If input format had extra size numbers or repeated counts (labels),
        // this parsing strategy still picks the first n expense numbers and the next n performance numbers.

        int result = Result.findMaximumPerformance(expense, performance, spending_cap);
        System.out.println(result);
    }
}