#Guess a number between 0-100
secret=52

ui=(input("guess a number between 0-100"))
#check user input
#keep asking while ui is not a number
while(ui.isdigit()):
    ui=(input("guess a number between 0-100"))
ui=int(ui)

while (secret!=ui):
    if secret < ui:
        print("Too high")
    elif secret > ui:
        print("too low")
    ui=int(input("guess a number between 0-100"))
    while(ui.isdigit()):
        ui=(input("guess a number between 0-100"))
    ui=int(ui)
print("You got it!")