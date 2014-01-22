package com.bronto.api.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class ConversionUtils {
    private static DatatypeFactory dataFactory;
    static {
        try {
            dataFactory = DatatypeFactory.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("Failed to create dataFactory", e);
        }
    }

    public static Date toDate(XMLGregorianCalendar date) {
        return date.toGregorianCalendar().getTime();
    }

    public static XMLGregorianCalendar toXMLCalendar(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(date.getTime());
        return dataFactory.newXMLGregorianCalendar(calendar);
    }
}
