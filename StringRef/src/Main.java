/*
 *
 *  * Copyright (C) 2015-1016. Jacob Alan Hein. All Rights Reserved.
 *  *
 *  * This file is part of {project}.
 *  *
 *  * This source code can not be copied and/or distributed without the express
 *  * permission of Jacob Alan Hein
 * /
 */

/**
 * Created by JacobHein on 3/1/15.
 */

 /*see also: Object.toString(),StringBuffer,StringBuilder,Charset,Serialized Form*/

public class Main {
 {
    /*strings are constant; their values cannot be changed after they are created.
     string buggers support mutable strings. because String objects are immutable
      they can be shared. for example;*/
      String one="abc";
      /*is equivalent to*/
      char data[]={'a','b','c'};
      String two = new String(data);

      System.out.println("abc");
      String cde="cde";
      System.out.println("abc"+cde);
      String c = "abc".substring(2,3);
      String d = cde.substring(1,2);
     }
  {
    String printf formats;
    "%-6d" = "an integer that takes 6 spaces and starts in the first space."
    "%07.2f" = "ex; 0001.23"
    "%+7.2f" = "adds + sign. ex; +1.23"
    "%(6.2f" = "a negative number would print (1.23)"
    "%,10d" = "shows decimal separators."
    "%^s" = "converts letters to upercase."
  }
    {
     /*String field summary*/
     String one="Abc";
     String two="cdE";
     static Comparator<String>
     /* CASE_INSENSITIVE_ORDER - A comparator that orders string objects as by
     * compareToIgnoreCase. */
    }
    {
      /*Constructor Summary*/

      String()
      /*Initializes a newly created String object so that it represents an empty
       character sequence.*/

      String(byte[] bytes);
      /*Constructs a new String by decoding the specified array of bytes using the
       platform's default charset.*/

      String(byte[], bytes, Charset charset);
      /*Constructs a new String by decoding the specified array of bytes using the
       specified charset.*/

      String(byte[] ascii, int hibyte);
      /*DEPRECATED*/
      /*This method does not properly convert bytes into characters. As of JDK 1.1,
       the preferred way to do this is via the String constructors that take a
        Charset, charset name, or that use the platform's default charset.*/

      String(byte[] bytes, int offset, int length);
      /*Constructs a new String by decoding the specified subarray of bytes using
       the platform's default charset.*/

      String(byte[] bytes, int offset, int length, Charset charset);
      /*Constructs a new String by decoding the specified subarray of bytes using
       the specified charset.*/

      String(byte[] ascii, int hibyte, int offset, int count);
      /*Deprecated.
      This method does not properly convert bytes into characters. As of JDK 1.1,
      the preferred way to do this is via the String constructors that take a
       Charset, charset name, or that use the platform's default charset.*/

      String(byte[] bytes, int offset, int length, String charsetName);
      /*Constructs a new String by decoding the specified subarray of bytes using
       the specified charset.*/

      String(byte[] bytes, String charsetName);
      /*Constructs a new String by decoding the specified array of bytes using the
       specified charset.*/

      String(char[] value);
      /*Allocates a new String so that it represents the sequence of characters
       currently contained in the character array argument.*/

      String(char[] value, int offset, int count);
      /*Allocates a new String that contains characters from a subarray of the
       character array argument.*/

      String(int[] codePoints, int offset, int count);
      /*Allocates a new String that contains characters from a subarray of the
       Unicode code point array argument.*/

      String(String original);
      /*Initializes a newly created String object so that it represents the same
       sequence of characters as the argument; in other words, the newly created
        string is a copy of the argument string.*/

      String(StringBuffer buffer);
      /*Allocates a new string that contains the sequence of characters currently
       contained in the string buffer argument.*/

      String(StringBuilder builder);
      /*Allocates a new string that contains the sequence of characters currently
       contained in the string builder argument.*/
    }
    {
      /*Static String Methods*/
      /* API ex; static String -> copyValueOf(char[] data) */

      copyValueOf(char[] data)
      /*Equivalent to valueOf(char[]).*/

      copyValueOf(char[] data, int offset, int count)
      /*Equivalent to valueOf(char[], int, int).*/

      format(Locale l, String format, Object... args)
      /*Returns a formatted string using the specified locale, format string, and
       arguments.*/

      format(String format, Object... args)
      /*Returns a formatted string using the specified format string and arguments
      .*/

      join(CharSequence delimiter, CharSequence... elements)
      /*Returns a new String composed of copies of the CharSequence elements
       joined together with a copy of the specified delimiter.*/

      join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
      /*Returns a new String composed of copies of the CharSequence elements
       joined together with a copy of the specified delimiter*/

      valueOf(boolean b)
      /*Returns the string representation of the boolean argument.*/

      valueOf(char c)
      /*Returns the string representation of the char argument*/

      valueOf(char[] data)
      /*Returns the string representation of the char array argument.*/

      valueOf(char[] data, int offset, int count)
      /*Returns the string representation of a specific subarray of the char array
       argument.*/

      valueOf(double d)
      /*Returns the string representation of the double argument.*/

      valueOf(float f)
      /*Returns the string representation of the float argument.*/

      valueOf(int i)
      /*Returns the string representation of the int argument.*/

      valueOf(long l)
      /*Returns the string representation of the long argument.*/

      valueOf(Object obj)
      /*Returns the string representation of the Object argument.*/
    }
    {
      /*Instance Methods*/
      /* Layout: Modifier and Type -> Method and Description. */

      char charAt(int index)
      /*Returns the char value at the specified index.*/

      int codePointAt(int index)
      /*Returns the character (Unicode code point) at the specified index.*/

      int codePointBefore(int index)
      /*Returns the character (Unicode code point) before the specified index.*/

      int codePointCount(int beginINdex, int endIndex)
      /*Returns the number of Unicode code points in the specified text range of this String.*/

      int compareTo(String anotherString)
      /*Compares two strings lexicographically*/

      int compareToIgnoreCase(String str)
      /*Compares two strings lexicographically, ignoring case differences.*/

      String concat(String str)
      /*Concatenates the specified string to the end of this string.*/

      boolean Contains(CharSequence s)
      /*Returns true if and only if this string contains the specified sequence of char values.*/

      boolean contentEquals(CharSequence cs)
      /*Compares this string to the specified CharSequence.*/

      boolean contentEquals(StringBuffer sb)
      /*Compares this string to the specified StringBuffer.*/

      boolean endsWith(String suffix)
      /*Tests if this string ends with the specified suffix.*/

      boolean equals(Object anObject)
      /*Compares this string to the specified object.*/

      boolean equalsIgnoreCase(String anotherString)
      /*Compares this String to another String, ignoring case considerations.*/

      byte[] getBytes()
      /*Encodes this String into a sequence of bytes using the platform's default charset,
       storing the result into a new byte array.*/

      byte[] getBytes(Charset charset)
      /*Encodes this String into a sequence of bytes using the given charset, storing the
       result into a new byte array.*/

      void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
      /*Deprecated.*/
      /*This method does not properly convert characters into bytes. As of JDK 1.1, the
       preferred way to do this is via the getBytes() method, which uses the platform's
       default charset.*/

      byte[] getBytes(String charsetName)
      /*Encodes this String into a sequence of bytes using the named charset, storing the
       result into a new byte array.*/

      void getChars(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
      /*Copies characters from this string into the destination character array.*/

      int hashCode()
      /*Returns a hash code for this string.*/

      int indexOf(int ch)
      /*Returns the index within this string of the first occurrence of the specified
      character.*/

      int indexOf(int ch, int fromIndex)
      /*Returns the index within this string of the first occurrence of the specified
       character, starting the search at the specified index.*/

      int indexOf(String str)
      /*Returns the index within this string of the first occurrence of the specified
      substring.*/

      int indexOf(String str, int fromIndex)
      /*Returns the index within this string of the first occurrence of the specified
      substring, starting at the specified index.*/

      String intern()
      /*Returns a canonical representation for the string object.*/

      boolean isEmpty()
      /*Returns true if, and only if, length() is 0.*/

      int lastIndexOf(int ch)
      /*Returns the index within this string of the last occurrence of the specified character.*/

      int lastIndexOf(int ch, int fromIndex)
      /*Returns the index within this string of the last occurrence of the specified character,
       searching backward starting at the specified index.*/

      int lastIndexOf(String str)
      /*Returns the index within this string of the last occurrence of the specified substring.*/

      int lastIndexOf(String str, int fromIndex)
      /*Returns the index within this string of the last occurrence of the specified substring,
       searching backward starting at the specified index.*/

      int length()
      /*Returns the length of this string.*/

      boolean matches(String regex)
      /*Regular Expression*/
      /*Tells whether or not this string matches the given regular expression*/

      int offsetByCodePoints(int index, int codePointOffset)
      /*Returns the index within this String that is offset from the given index by
       codePointOffset code points.*/

      boolean regionMatches(boolean ignoreCase, int tooffset, String other, int
       ooffset, int len)
      /*Tests if two string regions are equal.*/

      boolean regionMatches(int toffset, String other, int ooffset, int len)
      /*Tests if two string regions are equal.*/

      String replace(char oldChar, char newChat)
      /*Returns a string resulting from replacing all occurrences of oldChar in this
      string with newChar.*/

      String replace(CharSequence target, CharSequence replacement)
      /*Replaces each substring of this string that matches the literal target sequence
       with the specified literal replacement sequence.*/

      String replace all(String regex, String replacement)
      /*Regular Expression*/
      /*Replaces each substring of this string that matches the given regular expression
       with the given replacement.*/

      String replaceFirst(String regex, String replacement)
      /*Regular Expression*/
      /*Replaces the first substring of this string that matches the given regular expression
       with the given replacement.*/

      String[] split(String regex)
      /*Regular Expression*/
      /*Splits this string around matches of the given regular expression.*/

      String[] split(String regex, int limit)
      /*Regular Expression*/
      /*Splits this string around matches of the given regular expression.*/

      boolean startsWith(String prefix)
      /*Tests if this string starts with the specified prefix.*/

      boolean startsWith(String prefix, int toffset)
      /*Tests if the substring of this string beginning at the specified index starts with
      the specified prefix.*/

      CharSequence subSequence(int beginIndex, int endIndex)
      /*Returns a character sequence that is a subsequence of this sequence.*/

      String substring(int beginIndex)
      /*Returns a string that is a substring of this string.*/

      String substring(int beginINdex, int endIndex)
      /*Returns a string that is a substring of this string.*/

      char[] toCharArray()
      /*Converts this string to a new character array.*/

      String toLowerCase()
      /*Converts all of the characters in this String to lower case using the rules of the
       default locale.*/

      String toLowerCase(Locale locale)
      /*Converts all of the characters in this String to lower case using the rules of the
       given Locale.*/

      String toString()
      /*This object (which is already a string!) is itself returned.*/

      String toUpperCase()
      /*Converts all of the characters in this String to upper case using the rules of the
       default locale.*/

      String toUpperCase(Locale locale)
      /*Converts all of the characters in this String to upper case using the rules of the
       given Locale.*/

      String trim()
      /*Returns a string whose value is this string, with any leading and trailing whitespace
       removed.*/
    }
    {
      /*Concrete Methods*/
      /*Layout: Modifier and Type -> Method and Description*/

      char charAt(int index)
      /*Returns the char value at the specified index.*/

      int codePointAt(int index)
      /*Returns the character (Unicode code point) at the specified index.*/

      int codePointBefore(int index)
      /*Returns the character (Unicode code point) before the specified index.*/

      int codePointCount(int beginIndex, int endIndex)
      /*Returns the number of Unicode code points in the specified text range of this String.*/

      int compareTo(String anotherString)
      /*Compares two strings lexicographically.*/

      int compareToIgnoreCase(String str)
      /*Compares two strings lexicographically, ignoring case differences.*/

      String concat(String str)
      /*Concatenates the specified string to the end of this string.*/

      boolean contains(CharSequence s)
      /*Returns true if and only if this string contains the specified sequence of char values.*/

      boolean contentEquals(CharSequence cs)
      /*Compares this string to the specified CharSequence.*/

      boolean contentEquals(String buffer sb)
      /*Compares this string to the specified StringBuffer.*/

      static String copyValueOf(char[] data)
      /*Equivalent to valueOf(char[]).*/

      static String copyValueOf(char[] data, int offset, int count)
      /*Equivalent to valueOf(char[], int, int).*/

      boolean endsWith(String suffix)
      /*Tests if this string ends with the specified suffix.*/

      boolean equals(Object anObject)
      /*Compares this string to the specified object.*/

      boolean equalsIgnoreCase(String anotherString)
      /*Compares this String to another String, ignoring case considerations.*/

      static String format(locale l, String format, Object... args)
      /*Returns a formatted string using the specified locale, format string, and arguments.*/

      static String format(String format, Object... args)
      /*Returns a formatted string using the specified format string and arguments.*/

      byte[] getBytes()
      /*Encodes this String into a sequence of bytes using the platform's default charset,
       storing the result into a new byte array.*/

      byte[] getBytes(Charset charset)
      /*Encodes this String into a sequence of bytes using the given charset, storing the
       result into a new byte array.*/

      void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
      /*Deprecated.*/
      /*This method does not properly convert characters into bytes. As of JDK 1.1, the
       preferred way to do this is via the getBytes() method, which uses the platform's default
        charset.*/

      byte[] getBytes(String charsetName)
      /*Encodes this String into a sequence of bytes using the named charset, storing the
       result into a new byte array.*/

      void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
      /*Copies characters from this string into the destination character array.*/

      int hasCode()
      /*Returns a hash code for this string.*/

      int indexOf(int ch)
      /*Returns the index within this string of the first occurrence of the specified
       character.*/

      int indexOf(int ch, int fromIndex)
      /*Returns the index within this string of the first occurrence of the specified character,
       starting the search at the specified index.*/

      int indexOf(String str)
      /*Returns the index within this string of the first occurrence of the specified
       substring.*/

      int indexOf(String str, int fromIndex)
      /*Returns the index within this string of the first occurrence of the specified substring,
       starting at the specified index.*/

      String intern()
      /*Returns a canonical representation for the string object.*/

      boolean isEmpty()
      /*Returns true if, and only if, length() is 0.*/

      static String join(CharSequence delimiter, CharSequence... elements)
      /*Returns a new String composed of copies of the CharSequence elements joined together
       with a copy of the specified delimiter.*/

      static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
      /*Returns a new String composed of copies of the CharSequence elements joined together
       with a copy of the specified delimiter.*/

      int lastIndexOf(int ch)
      /*Returns the index within this string of the last occurrence of the specified character.*/

      int lastIndexOf(int ch, int fromIndex)
      /*Returns the index within this string of the last occurrence of the specified character,
       searching backward starting at the specified index.*/

      int lastIndexOf(String str)
      /*Regurns the index within this string of the last occurance of the specified substring.*/

      int lastIndexOf(String str, int fromIndex)
      /*Returns the index within this string of the last occurrence of the specified substring,
       searching backward starting at the specified index.*/

      int length()
      /*Returns the length of this string.*/

      boolean matches(String regex)
      /*Regular Expression*/
      /*Tells whether or not this string matches the given regular expression.*/

      int offsetByCodePoints(int index, int codePointOffset)
      /*Returns the index within this String that is offset from the given index by
      codePointOffset code points.*/

      boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
      /*Tests if two string regions are equal.*/

      boolean regionMatches(int toffset, String other, int ooffset, int len)
      /*Tests if two string regions are equal.*/

      String replace(char oldChar, char newChar)
      /*Returns a string resulting from replacing all occurrences of oldChar in this string
       with newChar.*/

      String replace(CharSequence target, CharSequence replacement)
      /*Replaces each substring of this string that matches the literal target sequence with
       the specified literal replacement sequence.*/

      String replaceAll(String regex, String replacement)
      /*Regular Expression*/
      /*Replaces each substring of this string that matches the given regular expression with
       the given replacement.*/

      String replaceFirst(String regex, String replacement)
      /*Regular Expression*/
      /*Replaces the first substring of this string that matches the given regular expression
       with the given replacement.*/

      String[] split(String regex)
      /*Regular Expression*/
      /*Splits this string around matches of the given regular expression.*/

      String[] split(String regex, int limit)
      /*Regular Expression*/
      /*Splits this string around matches of the given regular expression.*/

      boolean startsWith(String prefix)
      /*Tests if this string starts with the specified prefix.*/

      boolean startsWith(String prefix, int toffset)
      /*Tests if the substring of this string beginning at the specified index starts with the
       specified prefix.*/

      CharSequence subSequence(int beginIndex, int endIndex)
      /*Returns a character sequence that is a subsequence of this sequence.*/

      String substring(int beginIndex)
      /*Returns a string that is a substring of this string.*/

      String substring(int beginIndex, int endIndex)
      /*Returns a string that is a substring of this string.*/

      char[] toCharArray()
      /*Converts this string to a new character array.*/

      String toLowerCase()
      /*Converts all of the characters in this String to lower case using the rules of the
       default locale.*/

      String toLowerCase(Locale locale)
      /*Converts all of the characters in this String to lower case using the rules of the
       given Locale.*/

      String toString()
      /*This object (which is already a string!) is itself returned.*/

      String toUpperCase()
      /*Converts all of the characters in this String to upper case using the rules of the
       default locale.*/

      String toUpperCase(Locale locale)
      /*Converts all of the characters in this String to upper case using the rules of the
       given Locale.*/

      String trim()
      /*Returns a string whose value is this string, with any leading and trailing whitespace
      removed.*/

      static String valueOf(boolean b)
      /*Returns the string representation of the boolean argument.*/

      static String valueOf(char c)
      /*Returns the string representation of the char argument.*/

      static String valueOf(char[] data)
      /*Returns the string representation of the char array argument.*/

      static String valueOf(char[] data, int offset, int count)
      /*Returns the string representation of a specific subarray of the char array argument.*/

      static String valueOf(double d)
      /*Returns the string representation of the double argument.*/

      static String valueOf(float f)
      /*Returns the string representation of the float argument.*/

      static String valueOf(int i)
      /*Returns the string representation of the int argument.*/

      static String valueOf(long l)
      /*Returns the string representation of the long argument.*/

      static String valueOf(Object obj)
      /*Returns the string representation of the Object argument.*/
    }
    {
      /*Deprecated Methods*/
      /*Layout: Modifier and Type -> Method and Description*/

      void getBytes[](int srcBegin, int srcEnd, byte[] dst, int dstBegin)
      /*Deprecated.
      *This method does not properly convert characters into bytes. As of JDK 1.1, the
      *   preferred way to do this is via the getBytes() method, which uses the platform's
      *    default charset. */
    }
  }
