package Constant;

import org.openqa.selenium.By;

public class Constant {
    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 4;
    }
    public static class Urls {
        public static final String SKILL_HOME_PAGE = "https://skillfactory.ru/";
        public static final String ONLINE_COURSES = "https://skillfactory.ru/courses";

    }
    public static class EnterParam {
        public static final String nameIncorrect = "456789";
        public static final String emailIncorrect = "6543";
        public static final String phoneIncorrect = "cfghjk";
        public static final String nameCorrect = "Garry";
        public static final String emailCorrect = "sdfgh@ggf.vc";
        public static final String phoneCorrect = "9999999999";
    }
}
