public class freq {
    public void hello(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            char ch = arr[i];
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] == ch) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + ": " + count);
        }
    }

    public static void main(String[] args) {
        freq obj = new freq();
        String str = "java programming";

        obj.hello(str);
    }
}
