def pattern(num):
    for i in range(num):
        if i==0 :
            print(" "*(num-i+1)+"*"*(2*i+1))
        else:
            print(" "*(num-i+1)+"*"+" "*((2*i+1)-2)+"*")
    for i in range(num,-1,-1):
        if i==0:
            print(" "*(num-i+1)+"*"*(2*i+1))
        else:
            print(" "*(num-i+1)+"*"+" "*((2*i+1)-2)+"*")
pattern(3)