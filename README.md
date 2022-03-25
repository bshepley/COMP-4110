# COMP-4110 - Assignment 3
**Group 2**

→ Ariya Rasekh (105126455)

→ Brett Shepley (104826157)

→ Emily Boice (104752616)

→ Mohammad Elias Khan (110017199)

---

# Components

**1. TestClass**
- _Software:_ JUnit
- _Functionality:_ 
  - Tests that will check that the functions are working properly as development occurs and remain fully functional through the lifetime of the project
  - As you go through the version folders you can see that each time more of the test cases pass as each group of functions are implemented
- _Test Breakdown_: Each test case checks 4 different values within the valid range. For the trig functions, this is done in each of the 4 quadrants
  - test_factorial
  - test_pow
  - test_cos_deg
  - test_cos_rad
  - test_square
  - test_deg2rad
  - test_sin_deg
  - test_sin_rad
  - test_tan_deg
  - test_tan_rad
- _Notes:_ As all functions are to be built by the team the only exception we made was validating that the trig functions using the Java Math functions as the **expected** value
---
**2. MathLib**
- _Software:_ Java
- _Functionality:_ **Custom functions built by the team to accomplish their designated math functions**
  - my_factorial  - _(Support Function)_ takes an int as input, calculate the factorial and returns the int value (positive and negative values)
  - my_pow        - _(Support Function)_ takes 2 double as input (basis and exponent), calculates and returns the double value
  - my_cos_deg    - takes a double as input (degree), converts to radian then using the Taylor Series calculates the double value 
  - my_cos_rad    - takes a double as input (radian), then using the Taylor Series calculates the double value
  - my_square     - _(Support Function)_ takes a double as input, calculates the square and returns the double value
  - my_deg2rad    - _(Support Function)_ takes a double as input (degree), converts from degree to radian 
  - my_sin_deg    - takes a double as input (degree), converts to radian then using the Taylor Series calculates the double value
  - my_sin_rad    - takes a double as input (radian), then using the Taylor Series calculates the double value
  - my_tan_deg    - takes a double as input (degree), converts to radian then using the Taylor Series calculates the double value
  - my_tan_rad    - takes a double as input (radian), then using the Taylor Series calculates the double value
---
# Versions
Each of the versions represents an iteration of the development process, each time more test cases pass and more of the functions are developed.
There are 5 test cases to represent each of the important stages

**Version 1**
- Set up of all test cases and functions
- All test cases fail as none of the functionality has been developed

**Version 2**
- Implements all **supporting** functions
- Corresponding testcases pass and all others remain failing
  - my_factorial 
  - my_pow
  - my_square     
  - my_deg2rad

**Version 3**
-Implements **sin** functions
-Corresponding test cases and previously passing test cases pass, all others remain failing
 - my_sin_deg   
 - my_sin_rad

**Version 4**
-Implements **cos** functions
-Corresponding test cases and previously passing test cases pass, all others remain failing
 - my_cos_deg   
 - my_cos_rad
 - 
**Version 5**
-Implements **tan** functions - dependant on sin and cos functions
-All test cases pass
 - my_tan_deg   
 - my_tan_rad
---
# Additional Information
**Custom Exceptions:** There are many custom exceptions throughout the testing with the assertEquals function that has 4 parameters. The custom exception, the expected value, the actual value (calculated by the custom functions), and a delta value (the amount the value can be off but still pass the test). This exception tells the user where the issue is and the expected/actual values to have the needed information for why a test case is failing. The delta value is particularly important as the values of trig functions calculated using the Taylor Series are more accurate the more terms are used. Our functions use 11 terms, enough to get an accurate value without taking too long to process.

**Why GitHub:** Our Team opted to use GitHub over GitLabs as our team was already familiar with the program. Additionally, we can make the project public for ease of marketing and can be used in the future as proof of some of the experience we have with testing, JUnit and Java.

---
