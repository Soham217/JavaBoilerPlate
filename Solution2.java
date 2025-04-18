import java.util.*;
import java.io.*;
// Template - https://github.com/Soham217/JavaBoilerPlate/blob/main/Solution.java
public class Solution2 {
    static FastReader sc = new FastReader();
    static FastWriter out = new FastWriter();

    private void solve() {
        
    }

    public static void main(String[] soham) {
        int testCases = sc.nextInt();
        Solution2 obj = new Solution2();
        while (testCases-- > 0) {
            obj.solve();
        }
        out.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            try {
                return br.readLine().trim();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) {
            try {
                bw.append(String.valueOf(object));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void println(Object object) {
            print(object);
            try {
                bw.append("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
