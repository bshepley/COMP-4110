
def triangle_test(a=0, b=0, c=0):

    try:

        # Storing Input

        a = int(a)
        b = int(b)
        c = int(c)

        # Triangle Inequality Theorem

        if ((a + b) > c) and ((a + c) > b) and ((b + c) > a):
            if a == b == c:
                print("Equilateral Triangle: Pass")
            elif a == b or a == c or b == c:
                print("Isosceles Triangle: Pass")
            else:
                print("Scalene Triangle: Pass")
        else:
            print("Invalid via Triangle Inequality Theorem: Pass")


    except (TypeError, ValueError) as e:
        print(e)

# ---------- Valid Equilateral Triangle Test Case: Pass ---------- #

print("\nTest Case 1:\n")
triangle_test(1, 1, 1)

# ---------- Valid Isosceles Triangle Test Case: Pass ---------- #

print("\nTest Case 2:\n")
triangle_test(3, 3, 2)

# ---------- Valid Scalene Triangle Test Case: Pass ---------- #

print("\nTest Case 3:\n")
triangle_test(4, 2, 3)

# ---------- Invalid Isosceles Triangle Test Case: Pass ---------- #

print("\nTest Case 4:\n")
triangle_test(2, 2, 4)

# ---------- Invalid Scalene Triangle Test Case: Pass ---------- #

print("\nTest Case 5:\n")
triangle_test(1, 2, 3)

# ---------- Valid Permutations for Isosceles Triangle Sides Test Case: Pass ---------- #

print("\nTest Case 6:\n")
triangle_test(3, 3, 4)
triangle_test(3, 4, 3)
triangle_test(4, 3, 3)

# ---------- Invalid Input with One Side Being Zero: Pass ---------- #

print("\nTest Case 7:\n")
triangle_test(3, 4, 0)

# ---------- Invalid Input with One Side Being Negative: Pass ---------- #

print("\nTest Case 8:\n")
triangle_test(1, 1, -1)

# ---------- Invalid Input with The Sum of Two Sides Being Equal to The Third: Pass ---------- #

print("\nTest Case 9:\n")
triangle_test(1, 1, 2)

# ---------- Permutations of Invalid Input with The Sum of Two Sides Being Equal to The Third: Pass ---------- #

print("\nTest Case 10:\n")
triangle_test(1,2,1)
triangle_test(2,1,1)

# ---------- Three integers >0 such that the sum of two of the numbers is less than the third: Pass ---------- #

print("\nTest Case 11:\n")
triangle_test(1,1,3)

# ---------- Permutations of previous case, three integers >0 such that the sum of two of the numbers is less than the third: Pass ---------- #

print("\nTest Case 12:\n")
triangle_test(1,3,1)
triangle_test(3,1,1)

# ---------- Invalid Input All Sides Equal Zero: Pass ---------- #

print("\nTest Case 13:\n")
triangle_test(0, 0, 0)

# ---------- Invalid Input Non-Integer Value: Fail (Remove Try and Catch) ---------- #

print("\nTest Case 14:\n")
triangle_test(0, 0, 'a')

# ---------- Invalid Input Wrong Number of Values: Fail (Remove Auto-Bound Values) ---------- #

print("\nTest Case 15:\n")
triangle_test(1, 1)