/*
https://www.codewars.com/kata/54da539698b8a2ad76000228
*/
public class TakeATenMinuteWalk {
        public static boolean isValid(char[] walk) {
            if (walk.length != 10) {
                return false;
            }

            //counting directions
            int north = 0;
            int south = 0;
            int east = 0;
            int west = 0;

            for (char c : walk) {
                switch (c) {
                    case 'n' -> north++;
                    case 's' -> south++;
                    case 'e' -> east++;
                    case 'w' -> west++;
                }
            }

            return north == south && east == west;
        }
}
