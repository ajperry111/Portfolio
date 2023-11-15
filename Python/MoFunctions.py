#all imports should be the first couple of lines
import random

#function to generate list of random numbers
def giveMeSomeNumbers(size,lowEnd,highEnd):
    #generate 10 random numbers
    someNumbers = []
    #generate 10 random numbers
    for i in range(size):
        someNumbers.append(random.randint(lowEnd,highEnd))
    return someNumbers

#variable = returnFunction()
randomListOfNumbers=giveMeSomeNumbers(10,24,69)
print(randomListOfNumbers)
randomListOfNumbers=giveMeSomeNumbers(100,-1000000,7000000)
print(randomListOfNumbers)

'''
    When do create a function?
        Use things more than once - looking for repeating code
        Abstraction - got something complicated? Create once run many times
'''