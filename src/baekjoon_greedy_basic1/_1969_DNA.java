package baekjoon_greedy_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _1969_DNA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        char[][] nucleotide = new char[N][M];
        int[] countArr = new int[4]; // countArr = {0, 0, 0, 0} A C G T
        int max = countArr[0];
        char ch = 'A';
        int result = 0;
        StringBuffer DNA = new StringBuffer();

        HashMap<Integer, Character> count = new HashMap<>();
        count.put(0, 'A');
        count.put(1, 'C');
        count.put(2, 'G');
        count.put(3, 'T');

        for (int i = 0; i < N; i++) {
            nucleotide[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (nucleotide[j][i] == 'A') {
                    countArr[0]++;
                } else if (nucleotide[j][i] == 'C') {
                    countArr[1]++;
                } else if (nucleotide[j][i] == 'G') {
                    countArr[2]++;
                } else if (nucleotide[j][i] == 'T') {
                    countArr[3]++;
                }
            }
            for (int k = 0; k < countArr.length; k++) {
                if (max < countArr[k]) {
                    max = countArr[k];
                    ch = count.get(k);
                }
            }
            for (int l = 0; l < countArr.length; l++) {
                countArr[l] = 0;
            }

            result += N - max;
            max = 0;

            DNA.append(ch);
        }

        System.out.println(DNA);
        System.out.println(result);

    }
}
