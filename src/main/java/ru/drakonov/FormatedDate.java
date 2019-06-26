package ru.drakonov;

import java.text.SimpleDateFormat;
import java.util.Date;

class FormatedDate {

    public static String getFormattedDateNow() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        return formatForDateNow.format(dateNow);
    }
}
