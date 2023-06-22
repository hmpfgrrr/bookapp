package com.example.bookapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsbnValidator {

  private static final String ISBN_REGEX = "^(?:\\d{13}|\\d{3}-\\d{1}-\\d{2}-\\d{6}-\\d{1})$";

  public boolean isValidIsbn(String isbn) {
    Pattern p = Pattern.compile(ISBN_REGEX);
    Matcher m = p.matcher(isbn);

    return m.matches();
  }
}