from CheckInputClass import CheckInput
#checking to make sure the user puts in what you want
#check direct
#yes or no question
ui="yes"
if ui=="yes" or ui=="no":
    print("checked")
else:
    print("incorrect input")

#check in a list
ui="yes"
def checkInput(userInput,listOfAnswers):
    if userInput in listOfAnswers:  #["yes","no","Yes","No","NO","YES","Y","N","Yeah","Nah"]:
        print("checked")
        return True
    else:
        print("incorrect input")
        return False
if checkInput(ui,["yes","no","Yes","No","NO","YES","Y","N","Yeah","Nah"]):
    print("keep going in program")
    
while(not checkInput(ui,["yes","no","Yes","No","NO","YES","Y","N","Yeah","Nah"])):
    ui=input()

correctInput = CheckInput.getCorrectInput(ui,["yes","no","y","n"],"Do you like cheese?")

#change input
ui = "YES"
if ui =="yes":
    print("good")
    #lower and upper
    print(ui.upper())
    print(ui.lower())
    print(ui.title())
    #check number
    if ui.isdigit():   #check to see if the string is a number
        print("ui is a digit")
    #no special characters
    if (ui.isalnum()):
        print("it is a number or a letter")
    if (ui.alpha()):
        print("ui is a letter")