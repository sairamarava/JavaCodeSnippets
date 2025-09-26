def pattern(num):
    for i in range(num):
        print(" " * (num-i-1) + "* " * (i+1))
pattern(5)