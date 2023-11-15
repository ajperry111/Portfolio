#convert any unit to any unit... kind of

#the 3 apostrophes are string formatting 
menu='''
    in to cm (ic)
    cm to in (ci)
    
    which conversion?  
'''

def in2cm():
    inches = int(input("inches:  "))
    print(inches*2.54)
    
def cm2in():
    cm = int(input("cm:  "))
    print(cm/2.54)

user=input(menu)
#loop until the user says quit
while(user!="quit"):
    #run that specific conversion
    if user=="ic":
        in2cm()
        #run the in to cm function
        
    elif user=="ci":
        cm2in
        #run the cm to in function
    
    #ask the user whcih conversion?
    user=input(menu)
    
#define functions above where you run them