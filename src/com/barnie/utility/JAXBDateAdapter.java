package com.barnie.utility;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by wbarnie on 2/23/15.
 */
public class JAXBDateAdapter extends XmlAdapter<String, LocalDate> {

	/* This class uses Joda-time, to implement the xsd:date type as LocalDate since
     * the XMLGregorianCalendar default of JAXB is ugly.
	 */

    private static DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");

    public LocalDate unmarshal(String v) throws Exception {
        if (v == null || v.equals("")) {
            return null;
        } else {
            return fmt.parseLocalDate(v);
        }
    }

    public String marshal(LocalDate v) throws Exception {
        if (v == null) {
            return "";
        } else {
            return v.toString("yyyy-MM-dd");
        }
    }

}
