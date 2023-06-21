package com.example.bookapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsbnValidator {

  private static final String ISBN_REGEX = "^((97(8|9))?\\d{9}(\\d|X))|((97(8|9))?-\\d{1,5}-\\d{1,7}-\\d{1,6}-\\d)$";

  public boolean isValidIsbn(String isbn) {
    Pattern p = Pattern.compile(ISBN_REGEX);
    Matcher m = p.matcher(isbn);

    return m.matches();
  }
}