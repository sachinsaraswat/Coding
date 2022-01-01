# Program name: Greatest of Three Number
# Program Desc: Program will print largest number from the input



def findLargestNumber (vFirstNum, vSecondNum, vThirdNum):
    if (vFirstNum >= vSecondNum):
        if (vFirstNum >= vThirdNum):
            print ("Largest Number is :: ", vFirstNum)
        else:
            print ("Largest Number is :: ", vThirdNum)
    else:
        if (vSecondNum >= vThirdNum):
            print ("Largest Number is :: ", vSecondNum)
        else:
            print ("Largest Number is :: ", vThirdNum)

 

def findLargestNumberByElif(x, y, z):
    print("Largest Number is :: ")
    
    if y <= x > z:
        print(x)
    elif x <= y > z:
        print(y)
    elif y <=z > x :
        print(z)


#Main 


vFirstNumber = int(input("Enter the First Number:: "))
vSecondNumber = int(input("Enter the Second Number:: "))
vThirdNumber = int(input("Enter the Third Number:: "))

findLargestNumber(vFirstNumber,vSecondNumber, vThirdNumber)

findLargestNumberByElif(vFirstNumber,vSecondNumber, vThirdNumber)