'''
    Abstraction - removes or simplifies the complexity
    Procedures - Purple Blocks
    Functions - Block of code that completes an algorithm
    Methods - Objects of classes can call specific algorithms
    
    Functions main purpose is to simplify and reuse code
    Two main types:
        to do - literally does a process
        return - returns a process' result
        ***EVERY function technically returns something - defaults to None***
    None Type -> an empty piece of data, as in nothing is there, None data type
'''
    
#define the function
def howdy():
        #do this when I call the function
        print("howdy")
        
#call the function
howdy()

#print("hello"+input('what is your name')+int(input('age')))

'''
    Functions we've used:
        input()
        print()
        int()  ord()  bin()   chr()  float()
'''

#define a function that adds 2 numbers together
def adding():
    a=int(input("number 1 - "))
    b=int(input("number 2 - "))
    print(a+b)
    
adding()

#define a function to count y when given mxb
def ymxb():
    m=int(input("m: "))
    x=int(input("x: "))
    b=int(input("b: "))
    print(m*x+b)
    
#pass in the variables
#set the arguments
def ymxb(m,x,b):
    print(m*x+b)
    
#ymxb()
#ymxb(1,2,3)

#create x and y chart for the first 10 numbers of y=1x+4
#for i in range(10):
#    ymxb(1,i,4)

#define function x**2+4x+2      #x is a local variable
def parabola(x):
    #print(x**2+4*x+2)
    return x**2+4*x+2

print("x | y")
print("-----")
for i in range(6):
    print(f"{i} | {parabola(i)}")
    
    
    #Heli adsfjk iajd daskdnKNF;nfnvn   jhnn
    
