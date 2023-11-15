total=0
subtotal=0
#orderInformation=""
ketchupNum=0.0
order = []
#sandwich
#ask user if they would like a chicken, beef, or tofu
sandwich = input("Would you like a sandwich? (y/n) ")
while sandwich != "y" or "n":
    sandwich = input("Would you like a sandwich? (y/n) ")
    if sandwich =="y":
        sandwich = input("Which sandwich would you like: chicken $5.25, beef $6.25, tofu $5.75(c,b,t) ")
        while sandwich != "c" or "b" or "t":
            sandwich = input("Which sandwich would you like: chicken $5.25, beef $6.25, tofu $5.75(c,b,t) ")
            if sandwich=="c":
                order.append("Chicken Sandwich")
                subtotal+=5.25
            elif sandwich=="b":
                order.append("Beef Sandwich")
                subtotal+=6.25
            elif sandwich=="t":
                order.append("Tofu Sandwich")
                subtotal+=5.75
    else:
         order.append("no sandwich")
    
#orderInformation+=f"Sandwich:\t{sandwich}\n"  
#\t = tab
#\n = new line also known as pressing enter
#\s = space
    

#drinks
drink = input("Would you like a drink?(y/n) ")
while drink != "y" or "n":
    drink = input("Would you like a drink?(y/n) ")
    if drink=="y":
        drink = input("Which size? s,m,l ")
        if drink =="s":
            order.append("small drink")
            subtotal+=1
        elif drink == "m":
            order.append("medium drink")
            subtotal+=1.75
        elif drink == "l":
            drink = input("Would you like a child size for $.38 more? (y/n) ")
            if drink == "y":
                subtotal+=(2.25 + .38)
                #drink = "c"
                order.append("large drink w/ child size")
        else:
            subtotal+=2.25
            #drink='l'
            order.append("large drink")
    else:
        order.append("no drink")
#orderInformation+=f"Drink:\t{drink}\n"
    


#fries
fries = input("Would you like fries? y,n ")
if fries=="y":
    fries = input("Which size? s,m,l ")
    if fries=="s":
        fries = input("Would you like to mega size your fries for $1 more? y,n ")
        if fries=="y":
            subtotal+=2
            order.append("small fry/mega size")
        elif fries=="n":
            subtotal+=1
            order.append("small fry")
        
    elif fries=="m":
        subtotal+=1.5
        order.append("medium fry")
    elif fries=="l":
        subtotal+=2
        order.append("large fry")
else:
    order.append("no fries")
#orderInformation+=f"Fries:\t{fries}\n"

#ketchup
ketchup = input("Would you like ketchup with your order? y,n ")
if ketchup=="y":
    #subtotal+=int(input("How many packets would you like?"))*0.25
    ketchup=int(input("How many packets would you like?"))
    subtotal+=int(ketchup)*0.25
    order.append(f"{ketchup} ketchup packets")
else:
    order.append("no ketchup")
#orderInformation+=f"Ketchup:\t{ketchup}\n"
#checkout
if sandwich!="n" and drink!="n" and fries!="n":
    subtotal-=1
total=subtotal+.07*subtotal
subtotal=round(subtotal,ndigits=2)
total=round(total,ndigits=2)
print(order)
#print(orderInformation)
print(f"Subtotal: {subtotal}")
tax = round(subtotal - total,ndigits=2)
print(f"Tax: {tax}")
print(f"Total: {total}")
#print
