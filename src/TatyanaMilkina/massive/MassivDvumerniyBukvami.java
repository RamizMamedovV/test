package TatyanaMilkina.massive;

public class MassivDvumerniyBukvami {
    public static void main(String[] args) {
        char x = 'a';
        String[][] simbol = new String[13][14];
        //for (int i = 0; i < 3; i++) { // ili tak
             for (int i = 0; i < simbol.length; i++) { // ili tak
           // for (int j = 0; j < 4; j++) { // ili tak
                for (int j = 0; j < simbol[0].length; j++) { //ili tak

                    simbol[i][j] = x + "";
                System.out.print(simbol[i][j] + (j +1) + " ");
            }
            x++;
            System.out.println();
        }
    }

    public static class MassiveDvumerniy {
        public static void main(String[] args) {
            int[][] m = new int[2][3];
            int i,j,k = 0;
            for (i = 0; i< 2; i++) {
                for (j= 0; j< 3; j++){
                    m[i][j] = k++;
                    System.out.print(m[i][j] + " ");
                }  System.out.println();
            }
        }
    }

    public static class LessonMassive {
        public static void main(String[] args) {
            String[] week = new String[7];
            String[] month = {"jan", "feb", "mart", "aprel"};
            week[0] = "monday";
            week[1] = "tuesday";
            week[2] = "wednesday";
            week[3] = "thursday";
            week[4] = "friday";
            week[5] = "saturday";
            week[6] = "sunday";
            System.out.println(week[6]);
            System.out.println(month[0]);
        }
    }
}
