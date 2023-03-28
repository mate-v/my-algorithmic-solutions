class RobotReturnToOrigin {

/*
657.
https://leetcode.com/problems/robot-return-to-origin/description/
*/

    public boolean judgeCircle(String moves) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U' :
                    up++;
                    break;
                case 'D' :
                    down++;
                    break;
                case 'L' :
                    left++;
                    break;
                case 'R' :
                    right++;
                    break;
            }
        }

        return up == down && left == right; 
    }
}
