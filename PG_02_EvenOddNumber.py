# Program name: Even Odd numbers
# Program Desc: Program will print "Even Number" or "ODD Number" based on the input


def processInputNumberAndPrintEvenOdd(inputNumber):
    if(inputNumber %2 ==0):
        print (inputNumber , " is an Even Number")
    else:
        print (inputNumber , " is an Odd Number")



# Main 

vInputNumber = int(input("Enter the Number :: "))

processInputNumberAndPrintEvenOdd(vInputNumber)

