change=float(input("Change: "))
quarters = int(change//.25)
change = change%.25
dimes = int(change//.10)
change = change%.10
nickels = int(change//.05)
change = change%.05
pennies = int(change//.01)
if quarters > 1:
    print(f"{quarters} quarters")
elif quarters ==1: 
    print("1 quarter")
if dimes > 1:
    print(f"{dimes} dimes")
elif dimes ==1: 
    print("1 dime")
if nickels > 1:
    print(f"{nickels} nickels")
elif nickels ==1: 
    print("1 nickel")
if pennies > 1:
    print(f"{pennies} pennies")
elif pennies ==1: 
    print("1 penny")