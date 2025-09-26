def print_pattern(pattern_num, n):
    """
    Main function to print different patterns
    pattern_num: Pattern number to print
    n: Number of rows
    """
    print(f"\nPattern {pattern_num}:")
    
    if pattern_num == 1:
        # Basic Square Pattern
        # * * * *
        # * * * *
        # * * * *
        # * * * *
        for i in range(n):
            print("* " * n)
            
    elif pattern_num == 2:
        # Right Triangle Pattern
        # *
        # * *
        # * * *
        # * * * *
        for i in range(n):
            print("* " * (i + 1))
            
    elif pattern_num == 3:
        # Inverted Right Triangle
        # * * * *
        # * * *
        # * *
        # *
        for i in range(n, 0, -1):
            print("* " * i)
            
    elif pattern_num == 4:
        # Pyramid Pattern
        #    *
        #   * *
        #  * * *
        # * * * *
        for i in range(n):
            print(" " * (n-i-1) + "* " * (i+1))
            
    elif pattern_num == 5:
        # Number Pattern
        # 1
        # 1 2
        # 1 2 3
        # 1 2 3 4
        for i in range(1, n+1):
            for j in range(1, i+1):
                print(j, end=" ")
            print()
            
    elif pattern_num == 6:
        # Number Triangle Pattern
        # 1
        # 2 2
        # 3 3 3
        # 4 4 4 4
        for i in range(1, n+1):
            print(f"{i} " * i)
            
    elif pattern_num == 7:
        # Diamond Pattern
        #    *
        #   ***
        #  *****
        # *******
        #  *****
        #   ***
        #    *
        for i in range(n):
            print(" " * (n-i-1) + "*" * (2*i+1))
        for i in range(n-2, -1, -1):
            print(" " * (n-i-1) + "*" * (2*i+1))
            
    elif pattern_num == 8:
        # Hollow Square Pattern
        # * * * *
        # *     *
        # *     *
        # * * * *
        for i in range(n):
            for j in range(n):
                if i == 0 or i == n-1 or j == 0 or j == n-1:
                    print("*", end=" ")
                else:
                    print(" ", end=" ")
            print()
            
    elif pattern_num == 9:
        # Binary Pattern
        # 1
        # 0 1
        # 1 0 1
        # 0 1 0 1
        for i in range(n):
            for j in range(i+1):
                print((i+j)%2, end=" ")
            print()
            
    elif pattern_num == 10:
        # Alphabet Pattern
        # A
        # A B
        # A B C
        # A B C D
        for i in range(n):
            for j in range(i+1):
                print(chr(65+j), end=" ")
            print()

# Test all patterns
if __name__ == "__main__":
    n = 5  # Change this value to adjust pattern size
    for i in range(1, 11):
        print_pattern(i, n)