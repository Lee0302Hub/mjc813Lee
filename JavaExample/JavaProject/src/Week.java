public class Week {
    public enum WeekelyEnum {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

    }
    public void weekDay(String day) {
        WeekelyEnum week;
        switch(day) {
                case "MONDAY":
                week = WeekelyEnum.MONDAY;
                break;

                case "TUESDAY":
                week = WeekelyEnum.TUESDAY;
                break;

                case "WEDNESDAY":
                week = WeekelyEnum.WEDNESDAY;
                break;

                case "THURSDAY":
                week = WeekelyEnum.THURSDAY;
                break;

                case "FRIDAY":
                week = WeekelyEnum.FRIDAY;
                break;

                case "SATURDAY":
                week = WeekelyEnum.SATURDAY;
                break;

                case "SUNDAY":
                week = WeekelyEnum.SUNDAY;
                break;
        }

    }
}
