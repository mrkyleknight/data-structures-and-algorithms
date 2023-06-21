'use strict';

/* ------------------------------------------------------------------------------------------------
CHALLENGE 1 - Review

Write a function named replaceZeros that, given a string, uses Regex to replace all '0' with the word 'zero'.
------------------------------------------------------------------------------------------------ */

const replaceZeros = (string) => {
  // Solution code here...
  return string.replace(/0/g, 'zero');
};

// The function replaceZeros takes a parameter called string, which is the input text we want to modify.

// Inside the function, we use the replace method on the string variable. The replace method is used to find and replace parts of a string.

// We provide two arguments to the replace method:

// The first argument is a special pattern called a regular expression, represented by /0/g. This regular expression looks for the character '0' in the string.
// The second argument is the replacement string, which is the word 'zero'.
// The /0/g regular expression pattern is made up of two parts:

// The 0 inside the slashes /0/ represents the specific character we want to find, which is '0' in this case.
// The g after the closing slash / is a flag that tells the regular expression to search for all occurrences of '0' in the string, not just the first one.
// The replace method will go through the input string and replace every occurrence of '0' with the word 'zero'.

// Finally, the modified string is returned as the result of the replaceZeros function.

// To summarize, the replaceZeros function takes a string as input, searches for the character '0' using regular expressions, and replaces all occurrences with the word 'zero'. The modified string is then returned.


/* ------------------------------------------------------------------------------------------------
CHALLENGE 2

Write a function named validatePin that uses a regular expression pattern to validate a PIN.

If the PIN is four numerical digits long, return true. Otherwise, return false.
------------------------------------------------------------------------------------------------ */

const validatePin = (pin) => {
  // Solution code here...
  const regex = /^\d{4}$/;
  return regex.test(pin);

};

// The validatePin function takes a parameter called pin, which represents the PIN we want to validate.

// Inside the function, we define a regular expression pattern using the RegExp constructor. The pattern is ^\d{4}$.

// ^ asserts the start of the string.
// \d represents a digit character.
// {4} specifies that there should be exactly four occurrences of the preceding digit character.
// $ asserts the end of the string.
// This regular expression pattern ensures that the PIN consists of exactly four numerical digits.

// We use the test method of the regular expression object (regex) to check if the pin matches the pattern. The test method returns true if there is a match and false otherwise.

// The result of the test method is returned as the output of the validatePin function.

/* ------------------------------------------------------------------------------------------------
CHALLENGE 3

Write a function named validateWord that uses a regular expression pattern to validate that a word is between 5 and 10 characters long.

If the word is between 5 and 10 characters long, return true. Otherwise, return false.
------------------------------------------------------------------------------------------------ */

const validateWord = (word) => {
  // Solution code here...
  const regex = /^[a-zA-Z]{5,10}$/;

  // Test the word against the regex
  return regex.test(word);

};
/* 

The function validateWord checks if the word you give it is between 5 and 10 characters long.

This is done using something called a regular expression, which is a sort of pattern that the word is checked against. In our case, the pattern says "I'm looking for a word that only has alphabetic characters (both small and capital letters) and is between 5 and 10 characters long".

Here's a breakdown of how the pattern (^[a-zA-Z]{5,10}$) works:

The ^ at the start says "Start checking from the beginning of the word".

The [a-zA-Z] says "I'm looking for letters, either small (a-z) or capital (A-Z)".

The {5,10} says "I want the letters to be in a group that's at least 5 long, but no more than 10".

The $ at the end says "Stop checking at the end of the word".

So if the word matches this pattern (meaning it only has letters and is between 5 and 10 characters long), the function will return true (it's a valid word). If not, it returns false (it's not a valid word).

This function doesn't count words with special characters (like &, #, @, etc.) or numbers as valid. If you want those to be counted as valid, the pattern would need to be adjusted. For example, to include numbers and the underscore character (_), the pattern could be ^[a-zA-Z0-9_]{5,10}$.------------------------------------------------------------------------------------------------
CHALLENGE 4

Write a function named hasNumber that uses a regular expression pattern to determine if a string has one or more letter followed by one or more digit.

If it does, return true. If not, return false.
------------------------------------------------------------------------------------------------ */

const hasNumber = (string) => {
  const regex = /[a-zA-Z]+\d+/;

  
  return regex.test(string);

};

/* We're defining a function called hasNumber that takes one parameter string, which is the string you want to check.

Inside this function, we're creating a regular expression stored in the variable regex. This regular expression /[a-zA-Z]+\d+/ is looking for one or more letters [a-zA-Z]+ followed by one or more digits \d+.

Then we use the test method of our regular expression object regex to test if our string matches the pattern we defined. If it does, it will return true; if not, it will return false.

Remember, this function will return true if anywhere in the string there is at least one letter followed by at least one number. It doesn't matter what comes before or after that in the string. If you want to check that the whole string is exactly one or more letters followed by one or more numbers (with nothing before or after that), the regular expression would be /^[a-zA-Z]+\d+$/.------------------------------------------------------------------------------------------------
CHALLENGE 5

Write a function named validateEmail that takes in an email address and validates it based
on several rules:
  - one word, or two words separated by a period, before the @ symbol
  - can contain numbers
  - can have any of the following top-level domains: .net, .com, or .org
  - no other special characters
  - no subdomains, ports, etc: must be of the form name@place.com, not name@sub.place.com:3000

Return either true or false.

Note: if you ever need to validate an email using a regex in practice, the Internet has the actual regex you should use. It's many many lines long.
------------------------------------------------------------------------------------------------ */

const validateEmail = (email) => {
  // Solution code here...
  const regex = /^[a-z0-9]+(\.[a-z0-9]+)?@[a-z0-9]+(\.com|\.net|\.org)$/i;

  return regex.test(email);

};

/* // The regular expression used to validate the email:
  // ^ asserts start of line
  // ([a-z0-9]+) matches one or more alphanumeric characters
  // (\\.[a-z0-9]+)? matches optionally a period followed by one or more alphanumeric characters
  // @ matches the literal '@'
  // [a-z0-9]+ matches one or more alphanumeric characters
  // (\\.com|\\.net|\\.org) matches the TLDs .com, .net, .org
  // $ asserts end of line------------------------------------------------------------------------------------------------
CHALLENGE 6

Write a function named validatePhoneNumber that accepts a phone number and determines if it is valid.

Acceptable formats include:
 - (555) 555-5555
 - (555)555 5555
 - 555 555-5555
 - 555-5555555
 - 555-555 5555
 - 555-555-5555
 - 555 555 5555
 - 555555-5555
 - 5555555555

Your function should include a single regular expression pattern that matches any of these formats.

Return either true or false.
------------------------------------------------------------------------------------------------ */

const validatePhoneNumber = (phoneNumber) => {
  // Solution code here...
  const regex = /^(?:\(\d{3}\)\s?\d{3}-\d{4}|\d{3}-\d{3}-\d{4}|\d{3}\s\d{3}-\d{4}|\d{3}-\d{6}|\d{3}-\d{3}\s\d{4}|\d{3}\s\d{3}\s\d{4}|\d{3}\s\d{7}|\d{9}-\d{4}|\d{10})$/;

  return regex.test(phoneNumber);
};

/* Here's what each part of the regex does:

^ : This character is used to indicate the start of a line.

\( and \) : These match the actual parentheses. The backslash is required because parentheses have a special meaning in regex, so we need to escape them to use them as literal characters.

\d{3} : \d is a shorthand character class that matches any digit (equivalent to [0-9]). {3} specifies that we want exactly three of whatever precedes it (in this case, digits).

\s? : \s matches any whitespace character (spaces, tabs, line breaks). ? makes the preceding character optional. So \s? matches zero or one whitespace character.

- : This character is used to match a hyphen. No backslash is required as it has no special meaning in regex (except in a character class).

| : This character is used for alternation, similar to "or" in programming languages.

$ : This character is used to indicate the end of a line.

(?:...) : This is a non-capturing group. It groups the regex inside it together, but it doesn't remember the group as a separate entity. This can make the regex more efficient.

The different parts of the regex separated by | correspond to different acceptable formats of the phone number. The regex matches if any of them are true due to the | operator.------------------------------------------------------------------------------------------------
CHALLENGE 7 - Stretch Goal

Write a function named findTagNames that iterates over an array of HTML strings and uses a regular expression pattern to return the closing tags.

For example, findTagNames(['<h1>Hello, world!</h1>', '<p>Welcome to my site</p>']) returns ['/h1', '/p'].
findTagNames(['<div><h1>Hello, world!</h1></div>', '<p>Welcome to my site</p>']) returns ['/h1', '/div', '/p'].
------------------------------------------------------------------------------------------------ */

const findTagNames = elements => {
  // Solution code here...
};

/* ------------------------------------------------------------------------------------------------
TESTS

All the code below will verify that your functions are working to solve the challenges.

DO NOT CHANGE any of the below code.

Run your tests from the console: jest solutions-11.test.js
------------------------------------------------------------------------------------------------ */

describe('Testing challenge 1', () => {
  test('It should replace all the 0\'s with the word "zero"', () => {
    expect(replaceZeros('301 is s0 much fun!')).toStrictEqual('3zero1 is szero much fun!');
  });
});

describe('Testing challenge 2', () => {
  test('It should validate a PIN of exactly four digits', () => {
    expect(validatePin(1234)).toBeTruthy();
    expect(validatePin(123)).toBeFalsy();
    expect(validatePin(12345)).toBeFalsy();
    expect(validatePin('abcd')).toBeFalsy();
    expect(validatePin('7890')).toBeTruthy();
    expect(validatePin('0789')).toBeTruthy();
    expect(validatePin(789)).toBeFalsy();
    expect(validatePin('0000')).toBeTruthy();
  });
});

describe('Testing challenge 3', () => {
  test('It should validate a word between 5 and 10 characters', () => {
    expect(validateWord('Hello')).toBeTruthy();
    expect(validateWord('Bob')).toBeFalsy();
    expect(validateWord(12345)).toBeFalsy();
    expect(validateWord('abcdefghijkl')).toBeFalsy();
    expect(validateWord('cookie')).toBeTruthy();
    expect(validateWord(789)).toBeFalsy();
    expect(validateWord('Code301')).toBeFalsy();
  });
});

describe('Testing challenge 4', () => {
  test('It should return true if a string has one or more word characters followed by one or more digits', () => {
    expect(hasNumber('Hell0')).toBeTruthy();
    expect(hasNumber('Bob')).toBeFalsy();
    expect(hasNumber(12345)).toBeFalsy();
    expect(hasNumber('abcdefghijkl')).toBeFalsy();
    expect(hasNumber('c00kie')).toBeTruthy();
    expect(hasNumber(789)).toBeFalsy();
    expect(hasNumber('Code301')).toBeTruthy();
    expect(hasNumber('99Code')).toBeFalsy();
  });
});

describe('Testing challenge 5', () => {
  test('It should match a basic email', () => {
    expect(validateEmail('joe@codefellows.com')).toBeTruthy();
  });

  test('It should match if the email contains a period', () => {
    expect(validateEmail('joe.schmoe@codefellows.net')).toBeTruthy();
  });

  test('It should match if the email contains other top-level domains', () => {
    expect(validateEmail('joe@codefellows.org')).toBeTruthy();
  });

  test('It should match if the email contains a period and other top-level domains', () => {
    expect(validateEmail('joe.schmoe@codefellows.net')).toBeTruthy();
  });

  test('It should fail things that aren\'t email addresses', () => {
    expect(validateEmail('justastring')).toBeFalsy();
    expect(validateEmail('missing@adomain')).toBeFalsy();
    expect(validateEmail('@noname.com')).toBeFalsy();
    expect(validateEmail('.@noname.com')).toBeFalsy();
    expect(validateEmail('nolastname.@sadness.net')).toBeFalsy();
    expect(validateEmail('canadaisnotreal@canada.ca')).toBeFalsy();
    expect(validateEmail('needadot@inthesecondpart')).toBeFalsy();
    expect(validateEmail('missing.atsymbol.net')).toBeFalsy();
    expect(validateEmail('looksgood@sofar.comohnowaitthisisbad')).toBeFalsy();
    expect(validateEmail('no.middle.names@foryou.com')).toBeFalsy();
  });
});

describe('Testing challenge 6', () => {
  test('It should match the acceptable phone number formats', () => {
    expect(validatePhoneNumber('(555) 555-5555')).toBeTruthy();
    expect(validatePhoneNumber('555 555-5555')).toBeTruthy();
    expect(validatePhoneNumber('555-555-5555')).toBeTruthy();
    expect(validatePhoneNumber('555 5555555')).toBeTruthy();
    expect(validatePhoneNumber('5555555555')).toBeTruthy();
    expect(validatePhoneNumber('234 567 8910')).toBeTruthy();
  });
  test('It should not match unacceptable phone number formats', () => {
    expect(validatePhoneNumber('abcdefghij')).toBeFalsy();
    expect(validatePhoneNumber('222 222 2222 ext. 2222')).toBeFalsy();
    expect(validatePhoneNumber('(222 222-2222')).toBeFalsy();
    expect(validatePhoneNumber('222 222-2222-')).toBeFalsy();
    expect(validatePhoneNumber('(222 222- 2222')).toBeFalsy();
    expect(validatePhoneNumber('(222 222 -2222')).toBeFalsy();
    expect(validatePhoneNumber('523 555--5555')).toBeFalsy();
    expect(validatePhoneNumber('55555555555')).toBeFalsy();
    expect(validatePhoneNumber('55555555555')).toBeFalsy();
    expect(validatePhoneNumber('55555555555')).toBeFalsy();
    expect(validatePhoneNumber('55_55_5555')).toBeFalsy();
  });
});

xdescribe('Testing challenge 7', () => {
  test('It should return the closing tags', () => {
    expect(findTagNames(['<h1>Hello, world!</h1>', '<p>Welcome to my site</p>'])).toStrictEqual(['/h1', '/p']);
  });
  test('It should work if there are multiple closing tags in a single string', () => {
    expect(findTagNames(['<div><h1>Hello, world!</h1></div>', '<p>Welcome to my site</p>'])).toStrictEqual(['/h1', '/div', '/p']);
  });
});
