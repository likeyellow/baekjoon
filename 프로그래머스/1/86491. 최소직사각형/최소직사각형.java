class Solution {
    public int solution(int[][] sizes) {
        /*
        int answer = 0;
        int wMax = 0, hMax = 0;
        for(int w = 0; w < sizes.length; w++) {
            wMax = Math.max(wMax, sizes[w][0]);
        }
        for(int h = 0; h < sizes.length; h++) {
            hMax = Math.max(hMax, sizes[h][1]);
        }
        for(int i = 0; i < sizes.length; i++) {
            if(hMax == sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        int hhMax = 0; 
        for(int h = 0; h < sizes.length; h++) {
            hhMax = Math.max(hhMax, sizes[h][1]);
        }
        int wwMax = 0;
        for(int w = 0; w < sizes.length; w++) {
            wwMax = Math.max(wwMax, sizes[w][0]);
        }
        System.out.println(wwMax);
        answer = wwMax * hhMax;
        return answer;
        */
        int answer = 0;
        int width = 0, height = 0;
        for(int[] card : sizes) {
            width = Math.max(width, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        answer = width * height;
        return answer;
    }
}