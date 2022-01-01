# Program name: Positive Negative numbers
# Program Desc: Program will print "Postive Number" or "Negative Number" based on the input



def processInputAndPrintMessage(inputNumber):
    if (inputNumber >=0):
        print (inputNumber ,"is Positive Number")
    else:
        print (inputNumber ,"is Negative Number")



# Main 

vInputNumber = int(input("Enter the number:: "))

processInputAndPrintMessage(vInputNumber)