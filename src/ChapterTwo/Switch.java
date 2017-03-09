package ChapterTwo;

public class Switch {

    public static void main(String[] args) {

        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("1");
                break;
            case 0:
                System.out.println("2");
                break;
            case 6:
                System.out.println("3");

        }

        switch (dayOfWeek) {
            default:
                System.out.println("4");
            case 0:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");

        }

        int dayOfWeek2 = 6;
        switch (dayOfWeek2) {
            default:
                System.out.println("7");
                break;
            case 0:
                System.out.println("8");
                break;
            case 6:
                System.out.println("9");

        }

        switch (dayOfWeek2) {
            case 0:
                System.out.println("10");
                break;
            case 6:
                System.out.println("11");
            default:
                System.out.println("12");
                break;
        }
    }

//    private int getSortOrder(String firstName, final String lastName) {
//        String middleName = "Patricia";
//        final String suffix = "JR";
//        int id = 0;
//        switch (firstName) {
//            case "Test":
//                return 52;
//            case middleName:       // DOES NOT COMPILE
//                id = 5;
//                break;
//            case suffix:
//                id = 0;
//                break;
//            case lastName:  // DOES NOT COMPILE
//                id = 8;
//                break;
//            case 5:  // DOES NOT COMPILE
//                id = 7;
//                break;
//            case 'J':  // DOES NOT COMPILE
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE
//                id = 15;
//                break;
//        }
//        return id;
//    }


}
