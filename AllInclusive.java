/*
https://www.codewars.com/kata/5700c9acc1555755be00027e
 */
public class AllInclusive {
    public static void main(String[] args) {

        String s3 = "Ajylvpy";
        List<String> l3 = new ArrayList<>(List.of("Ajylvpy", "Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"));

        System.out.println(containsAllRots(s3, l3));
    }

    public static boolean containsAllRots(String str, List<String> list) {
        if (str.isEmpty()) {
            return true;
        }

        String preceding = "";
        String remaining = "";
        String aRotation = "";


        for (int i = 0; i < str.length(); i++) {
            remaining = str.substring(i + 1);
            preceding = str.substring(0, i + 1);
            aRotation = remaining.concat(preceding);

            if (!list.contains(aRotation)) {
                 return false;
            }
        }

        return true;
    }
}
