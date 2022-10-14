/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;

/**
 *
 * @author Prefeitura Mampituba
 */
public class GetDate {
    
  public String getDate() 
  {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	return dateFormat.format(date);
   }
    
   public boolean validaData(String strDate) 
   {
    
       String dateFormat = "dd/MM/uuuu";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
        .ofPattern(dateFormat)
        .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        } 
    }
}